package flyingtest;

import java.util.Random;

import flyingtest.Airplane.Award;


public class Bee extends FlyObject implements Award{
	private int xSpeed = 1;//x�����ƶ��ٶ�
	private int ySpeed = 2;//y�����ƶ��ٶ�
	private int awardTye ; //��������
	
	//��ʼ������
	public Bee (){
		this.image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y = -heigth;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
		awardType = rand.nextInt(2);//��ʼ��ʱ������
		
		//��ý�������
		public int getType(){
			return y > ShootGame.HEIGHT;
		}
		
		//Խ�紦��
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