(function () {
    'use strict';

    /**
     * 修改为“是男人就撑100秒”
     */
    class GameControl extends Laya.Script {
        //这里注册的prop会体现在Scene的组件中
        /** @prop {name:bullet,tips:"子弹预制体对象",type:Prefab}*/
        /** @prop {name:plane,tips:"飞机预制体",type:Prefab}*/
        /** @prop {name:createBoxInterval,tips:"间隔多少毫秒创建一个下跌的容器",type:int,default:1000}*/

        constructor() {
            super();
            //间隔多少毫秒创建一个下跌的容器
            this.createBoxInterval = 100;
            //开始时间
            this._time = Date.now();
            //是否已经开始游戏
            this._started = false;
        }
        onEnable() {
            //子弹和盒子所在的容器对象
            this._gameBox = this.owner.getChildByName("gameBox");
        }

        onUpdate() {
            //每间隔一段时间创建一颗子弹

            //获取当前时间，this._time表示上次执行时间
            let now = Date.now();
            
            //now - this._time则表示时间间隔
            if (now - this._time > this.createBoxInterval && this._started) {
                this._time = now;
                this.createBullet();
            }
        }

        createBullet() {
            //使用对象池创建盒子
            let bullet = Laya.Pool.getItemByCreateFun("bullet2", this.bullet.create, this.bullet);
            this._gameBox.addChild(bullet);
        }

        createPlane() {
            let planeIns = Laya.Pool.getItemByCreateFun("plane_key", this.plane.create, this.plane);
            this._gameBox.addChild(planeIns);
            return planeIns;
        }

        onStageMouseMove(e) {
            if (this._plane) {
                //移动飞机
                this._plane.pos(Laya.stage.mouseX, Laya.stage.mouseY);
            }
        }

        /**开始游戏，通过激活本脚本方式开始游戏*/
        startGame() {
            if (!this._started) {
                this._started = true;
                this.enabled = true;
                this._plane = this.createPlane();
            }
        }

        /**结束游戏，通过非激活本脚本停止游戏 */
        stopGame() {
            this._started = false;
            this.enabled = false;
            this.createBoxInterval = 1000;
            this._gameBox.removeChildren();
        }
    }

    /**
     * 本示例采用非脚本的方式实现，而使用继承页面基类，实现页面逻辑。在IDE里面设置场景的Runtime属性即可和场景进行关联
     * 相比脚本方式，继承式页面类，可以直接使用页面定义的属性（通过IDE内var属性定义），比如this.tipLbll，this.scoreLbl，具有代码提示效果
     * 建议：如果是页面级的逻辑，需要频繁访问页面内多个元素，使用继承式写法，如果是独立小模块，功能单一，建议用脚本方式实现，比如子弹脚本。
     */
    class GameUI$1 extends Laya.Scene {
        constructor() {
            super();
            //设置单例的引用方式，方便其他类引用
            GameUI$1.instance = this;
            //关闭多点触控，否则就无敌了
            Laya.MouseManager.multiTouchEnabled = false;
            //加载场景文件
            this.loadScene("test/TestScene.scene");
        }

        onEnable() {
            //戏控制脚本引用，避免每次获取组件带来不必要的性能开销
            this._control = this.getComponent(GameControl);
            //点击提示文字，开始游戏
            this.tipLbll.on(Laya.Event.CLICK, this, this.onTipClick);
        }

        onTipClick(e) {
            //让文本框消失
            this.tipLbll.visible = false;
            //清空积分
            this._score = 0;
            //清空文本
            this.scoreLbl.text = "";
            //启动游戏，_control是GameControl.js文件
            this._control.startGame();
        }

        /**增加分数 */
        addScore(value) {
            this._score += value;
            this.scoreLbl.changeText("分数：" + this._score);
            //随着分数越高，难度增大
            if (this._control.createBoxInterval > 600 && this._score % 20 == 0) this._control.createBoxInterval -= 20;
        }

        /**停止游戏 */
        stopGame() {
            this.tipLbll.visible = true;
            this.tipLbll.text = "游戏结束了，点击屏幕重新开始";
            this._control.stopGame();
        }
    }

    /**
     * 子弹脚本，实现子弹飞行逻辑及对象池回收机制
     */
    class Bullet extends Laya.Script {
        constructor() { super(); }
        onEnable() {
            //设置初始速度
            var rig = this.owner.getComponent(Laya.RigidBody);
            rig.setVelocity({ x: 0, y: -10 });
        }

        onTriggerEnter(other, self, contact) {
            //如果被碰到，则移除子弹
            this.owner.removeSelf();
        }

        onUpdate() {
            //如果子弹超出屏幕，则移除子弹
            if (this.owner.y < -10) {
                this.owner.removeSelf();
            }
        }

        onDisable() {
            //子弹被移除时，回收子弹到对象池，方便下次复用，减少对象创建开销
            Laya.Pool.recover("bullet", this.owner);
        }
    }

    /**
     * 掉落盒子脚本，实现盒子碰撞及回收流程
     */
    class Bullet2 extends Laya.Script {
        constructor() { super(); }
        onEnable() {
            /**获得组件引用，避免每次获取组件带来不必要的查询开销 */
            var rig = this.owner.getComponent(Laya.RigidBody);

            //三个方向随机数，0~2分别表示东，北，西
            let dir = Math.floor(Math.random() * 3);

            switch (dir) {
                case 0:
                    //从左侧随机飞出
                    this.owner.pos(-100, Math.random() * Laya.stage.height);
                    rig.setVelocity({ x: Math.random().toFixed(1) * 10 + 4, y: Math.random().toFixed(1) * 10 - 5 });
                    break;
                case 1:
                    //从上方随机飞出
                    this.owner.pos(Math.random() * Laya.stage.width, -100);
                    rig.setVelocity({ x: Math.random().toFixed(1) * 20 - 10, y: Math.random().toFixed(1) * 10 + 4 });
                    break;
                case 2:
                    this.owner.pos(Laya.stage.width + 100, Math.random() * Laya.stage.height);
                    rig.setVelocity({ x: -(Math.random().toFixed(1) * 10 + 4), y: Math.random().toFixed(1) * 10 + 4 });
                    break;
            }

        }

        onUpdate() {
            //让持续子弹旋转
            this.owner.rotation++;
        }

        onTriggerEnter(other, self, contact) {

        }



        onDisable() {
            //盒子被移除时，回收盒子到对象池，方便下次复用，减少对象创建开销。
            Laya.Pool.recover("bullet2", this.owner);
        }
    }

    /**
     * 掉落盒子脚本，实现盒子碰撞及回收流程
     */
    class DropBox extends Laya.Script {
        constructor() { super(); }
        onEnable() {
            /**获得组件引用，避免每次获取组件带来不必要的查询开销 */
            this._rig = this.owner.getComponent(Laya.RigidBody);
            //盒子等级
            this.level = Math.round(Math.random() * 5) + 1;
            //等级文本对象引用
            this._text = this.owner.getChildByName("levelTxt");
            this._text.text = this.level + "";
        }

        onUpdate() {
            //让持续盒子旋转
            this.owner.rotation++;
        }

        onTriggerEnter(other, self, contact) {
            var owner = this.owner;
            if (other.label === "buttle") {
                //碰撞到子弹后，增加积分，播放声音特效
                if (this.level > 1) {
                    this.level--;
                    this._text.changeText(this.level + "");
                    owner.getComponent(Laya.RigidBody).setVelocity({ x: 0, y: -10 });
                    Laya.SoundManager.playSound("sound/hit.wav");
                } else {
                    if (owner.parent) {
                        let effect = Laya.Pool.getItemByCreateFun("effect", this.createEffect, this);
                        effect.pos(owner.x, owner.y);
                        owner.parent.addChild(effect);
                        effect.play(0, true);
                        owner.removeSelf();
                        Laya.SoundManager.playSound("sound/destroy.wav");
                    }
                }
                GameUI$1.instance.addScore(1);
            } else if (other.label === "ground") {
                //只要有一个盒子碰到地板，则停止游戏
                owner.removeSelf();
                GameUI$1.instance.stopGame();
            }
        }

        /**使用对象池创建爆炸动画 */
        createEffect() {
            let ani = new Laya.Animation();
            ani.loadAnimation("test/TestAni.ani");
            ani.on(Laya.Event.COMPLETE, null, recover);
            function recover() {
                ani.removeSelf();
                Laya.Pool.recover("effect", ani);
            }
            return ani;
        }

        onDisable() {
            //盒子被移除时，回收盒子到对象池，方便下次复用，减少对象创建开销。
            Laya.Pool.recover("dropBox", this.owner);
        }
    }

    /**
     * 子弹脚本，实现子弹飞行逻辑及对象池回收机制
     */
    class Plane extends Laya.Script {
        constructor() { super(); }
        onEnable() {
            //设置初始速度
        }

        onTriggerEnter(other, self, contact) {
            alert(1);
            var owner = this.owner;
            if (other.label === "plane") {
                //击中飞机
                if (owner.parent) {
                    let effect = Laya.Pool.getItemByCreateFun("effect", this.createEffect, this);
                    effect.pos(owner.x, owner.y);
                    owner.parent.addChild(effect);
                    effect.play(0, true);
                    owner.removeSelf();
                    Laya.SoundManager.playSound("sound/destroy.wav");
                }
                GameUI.instance.stopGame();
            } else if (other.label === "ground") {
                owner.removeSelf();
            }
        }
        /**使用对象池创建爆炸动画 */
        createEffect() {
            let ani = new Laya.Animation();
            ani.loadAnimation("test/TestAni.ani");
            ani.on(Laya.Event.COMPLETE, null, recover);
            function recover() {
                ani.removeSelf();
                Laya.Pool.recover("effect", ani);
            }
            return ani;
        }
        onUpdate() {
            //如果子弹超出屏幕，则移除子弹
        }

        onDisable() {
            //子弹被移除时，回收子弹到对象池，方便下次复用，减少对象创建开销
        }
    }

    /**This class is automatically generated by LayaAirIDE, please do not make any modifications. */

    class GameConfig {
        static init() {
            //注册Script或者Runtime引用
            let reg = Laya.ClassUtils.regClass;
    		reg("script/GameUI.js",GameUI$1);
    		reg("script/GameControl.js",GameControl);
    		reg("script/Bullet.js",Bullet);
    		reg("script/Bullet2.js",Bullet2);
    		reg("script/DropBox.js",DropBox);
    		reg("script/Plane.js",Plane);
        }
    }
    GameConfig.width = 640;
    GameConfig.height = 1136;
    GameConfig.scaleMode ="fixedwidth";
    GameConfig.screenMode = "none";
    GameConfig.alignV = "top";
    GameConfig.alignH = "left";
    GameConfig.startScene = "test/TestScene.scene";
    GameConfig.sceneRoot = "";
    GameConfig.debug = false;
    GameConfig.stat = false;
    GameConfig.physicsDebug = false;
    GameConfig.exportSceneToJson = true;

    GameConfig.init();

    class Main {
    	constructor() {
    		//根据IDE设置初始化引擎		
    		if (window["Laya3D"]) Laya3D.init(GameConfig.width, GameConfig.height);
    		else Laya.init(GameConfig.width, GameConfig.height, Laya["WebGL"]);
    		Laya["Physics"] && Laya["Physics"].enable();
    		Laya["DebugPanel"] && Laya["DebugPanel"].enable();
    		Laya.stage.scaleMode = GameConfig.scaleMode;
    		Laya.stage.screenMode = GameConfig.screenMode;
    		Laya.stage.alignV = GameConfig.alignV;
    		Laya.stage.alignH = GameConfig.alignH;
    		//兼容微信不支持加载scene后缀场景
    		Laya.URL.exportSceneToJson = GameConfig.exportSceneToJson;

    		//打开调试面板（通过IDE设置调试模式，或者url地址增加debug=true参数，均可打开调试面板）
    		if (GameConfig.debug || Laya.Utils.getQueryString("debug") == "true") Laya.enableDebugPanel();
    		if (GameConfig.physicsDebug && Laya["PhysicsDebugDraw"]) Laya["PhysicsDebugDraw"].enable();
    		if (GameConfig.stat) Laya.Stat.show();
    		Laya.alertGlobalError(true);

    		//激活资源版本控制，version.json由IDE发布功能自动生成，如果没有也不影响后续流程
    		Laya.ResourceVersion.enable("version.json", Laya.Handler.create(this, this.onVersionLoaded), Laya.ResourceVersion.FILENAME_VERSION);
    	}

    	onVersionLoaded() {
    		//激活大小图映射，加载小图的时候，如果发现小图在大图合集里面，则优先加载大图合集，而不是小图
    		Laya.AtlasInfoManager.enable("fileconfig.json", Laya.Handler.create(this, this.onConfigLoaded));
    	}

    	onConfigLoaded() {
    		//加载IDE指定的场景
    		GameConfig.startScene && Laya.Scene.open(GameConfig.startScene);
    	}
    }
    //激活启动类
    new Main();

}());
