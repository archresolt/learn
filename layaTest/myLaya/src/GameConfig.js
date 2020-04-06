/**This class is automatically generated by LayaAirIDE, please do not make any modifications. */
import GameUI from "./script/GameUI"
import GameControl from "./script/GameControl"
import Bullet from "./script/Bullet"
import Bullet2 from "./script/Bullet2"
import DropBox from "./script/DropBox"
import Plane from "./script/Plane"

export default class GameConfig {
    static init() {
        //注册Script或者Runtime引用
        let reg = Laya.ClassUtils.regClass;
		reg("script/GameUI.js",GameUI);
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
