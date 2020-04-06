/**
 * 修改为“是男人就撑100秒”
 */
export default class GameControl extends Laya.Script {
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