package flyingtest;

import java.util.Random;

	public class Airplane extends FlyObject implements Enemy{
		private int speed = 3;//移动步骤
		//初始化数据
		public Airplane (){
			this.image = ShootGame.airplane;
			width = image.getWidth();
			height = image.getHeight();
			y = - height;
			Random rand = new Random();
			x = rand.nextInt(ShootGame.WIDTH - width);
		}
		
		//获取分数
		public int getScore(){
			return 5;
		}
		//越界处理
		public boolean outofBounds(){
			return y > ShootGame.HEIGHT;
		}
		//移动
		public void step(){
			y += speed;
		}
		//分数奖励
		public interface Award{
			int DOUBLE_FIRE = 0;//双倍火力
			int LIFE = 1;//1条命
			int getType();
		}
		public interface Enemy{
			int getScore();
		}
		@Override
		public boolean outOfBounds() {
			// TODO 自动生成的方法存根
			return false;
		}
		
	}


