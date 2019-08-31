package flyingtest;

import java.util.Random;

import flyingtest.Airplane.Award;


public class Bee extends FlyObject implements Award{
	private int xSpeed = 1;//x坐标移动速度
	private int ySpeed = 2;//y坐标移动速度
	private int awardTye ; //奖励类型
	
	//初始化数据
	public Bee (){
		this.image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y = -heigth;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
		awardType = rand.nextInt(2);//初始化时给奖励
		
		//获得奖励类型
		public int getType(){
			return y > ShootGame.HEIGHT;
		}
		
		//越界处理
		public boolean outOfBounds(){
			return y > ShootGame.HEIGHT;
			
		}
		public void step(){
			x += xSpeed;
			y += ySpeed;
			if(x > ShootGame.WIDTH-width){
				xSpeed = -1;
			}
			if(x<0){
				xSpeed = 1;
			}
		}
		
	}
}
}
