package flyingtest;

public class Bullet extends FlyObject {
	private int speed = 3;//�ƶ����ٶ�

	//��ʼ������
	public Bullet (int x ,int y){
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}


//�ƶ�
public void step(){
	y -=speed;
}
//Խ�紦��
public boolean outOfBounds(){
	return y < -height;
}

}