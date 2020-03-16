/**
 * 子弹脚本，实现子弹飞行逻辑及对象池回收机制
 */
export default class Plane extends Laya.Script {
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