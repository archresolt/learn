package flyingtest;

import java.util.Random;

	public class Airplane extends FlyObject implements Enemy{
		private int speed = 3;//�ƶ�����
		//��ʼ������
		public Airplane (){
			this.image = ShootGame.airplane;
			width = image.getWidth();
			height = image.getHeight();
			y = - height;
			Random rand = new Random();
			x = rand.nextInt(ShootGame.WIDTH - width);
		}
		
		//��ȡ����
		public int getScore(){
			return 5;
		}
		//Խ�紦��
		public boolean outofBounds(){
			return y > ShootGame.HEIGHT;
		}
		//�ƶ�
		public void step(){
			y += speed;
		}
		//��������
		public interface Award{
			int DOUBLE_FIRE = 0;//˫������
			int LIFE = 1;//1����
			int getType();
		}
		public interface Enemy{
			int getScore();
		}
		@Override
		public boolean outOfBounds() {
			// TODO �Զ����ɵķ������
			return false;
		}
		
	}

