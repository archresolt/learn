package flyingtest;

public class Yingxiongji extends Feixingwu {
	private BufferedImage[] images = {};//英雄机图片
	private int index = 0 ;//英雄级图片切换索引
	private int doubleFire;//双倍火力
	private int life; //命
	
	
	//初始化数据
	public Yingxiongji(){
		life = 3;//初始化3条命
		doubleFire = 0;//初始火力为0
		images = new BufferedImage[]{
				ShootGame.hero0,ShootGame.hero1};//英雄机图片数组
		image = ShootGame.hero0;//初始为hero0图片
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
		}
	//获取双倍火力
	public int isDoubleFire(){
		return doubleFire;
	}
	//设置双倍火力
	public void setDoubleFire(int doubleFire){
		this.doubleFire = doubleFire;
	}
	//增加火力
	public void addDoubleFire(){
		doubleFire = 40;
	}
	//增命
	public void addLife(){
		life++;
	}
	//减命
	public void subtractLife(){
		life--;
	}
	//获取命
	public int getLife(){
		reeturn life;
	}
	//当前物体移动了一下，相对距离，x，y鼠标位置
	public void moveTo(int x,int y){
		this.x = x - width/2;
		this.y = y - heigth/2;
	}
	//越界处理
	public boolean outOfBounds(){
		return false;
	}
	
	//发射子弹
	public Bullet[] shoot (){
		int xStep = width/4;
		int yStep = 20;
		if(doubleFire > 0){
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(x + xStep, y- yStep);
			bullets[1] = new Bullet(x = 3*xStep ,y - yStep);
			return bullets;
			
		}else{
			//单倍火力
			Bullet[] Bullets = new Bullet[1];
			bullets[0] = new Bullet(x + 2*xStep,y-yStep);
			return bullets;
		}
	}
	
	//移动
	public void step(){
		if (image.length>0){
			image = images[index++ / 10%images.length];//切换图片
		}
		//碰撞算法
		public boolean hit(Feixingwu other){
			int x1 = other.x - this.width/2;//x坐标最小距离
			int x2 = other.x - this.width/2 +other.width;//x坐标最大距离
			int y1 = other.y - this.height/2;//y坐标最小距离
			int y2 = other.y - this.height/2 + other.height;//y坐标最大距离
			
			int yingxiongjix = this.x + this.width/2;//英雄机x坐标中心点距离
			int yingxiongjiy = this.y + this.height/2;//英雄机y坐标中心点距离
			
			return yingxiongji>x1 && yingxiongji<x2 && yingxiongji>y1 && yingxiongji < y2;//区间范围内撞上了
		}
	}

}
