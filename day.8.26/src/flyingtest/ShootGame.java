package flyingtest;

import java.awt.image.BufferedImage;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
public static final int WIDTH = 400;
public static final int HEIGHT = 654;

private int state ;
private static final int STATE = 0;
private static final int RUNNING = 1;
private static final int PAUSE = 2;
private static final int GAME_OVER = 3;

private int score = 0;
private Timer timer ;//定时器
private int intervel = 1000/100;//间隔时间(毫秒)

public static BufferedImage background;
public static BufferedImage start;
public static BufferedImage airplane;
public static BufferedImage bee;
public static BufferedImage bullet;
public static BufferedImage hero0;
public static BufferedImage hero1;
public static BufferedImage pause;
public static BufferedImage gameover;

private FlyingObject[] flyings = {};//敌机数组
private Bullet[] bullets = {};//子弹数组
private Hero hero = new Hero(); //英雄机

static {//静态代码块，初始化图片资源
	try{
		background = ImageIO.read(ShootGame.class.getResource("background.png"));
		start = ImageIO.read(ShootGame.class.getResource("start.png"));
		airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
		bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
		bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
		hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
		hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
		pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
		gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
		
	}catch (Exception e){
		e.printStackTrace();
	}
}


}
