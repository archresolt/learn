import GameUI from "./GameUI";
/**
 * 掉落盒子脚本，实现盒子碰撞及回收流程
 */
export default class Bullet2 extends Laya.Script {
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