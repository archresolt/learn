package flyingtest;

import java.awt.image.BufferedImage;

public abstract class FlyObject {
	protected int x;//X坐标
	protected int y;//y坐标
	protected int width;//宽
	protected int height;//高
	protected BufferedImage image;//图片
	
 public int getX(){
	 return x;
 }
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getWidth(){
		return width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public BufferedImage getImage(){
		return image;
		
	}
	public void setImage(BufferedImage image){
		this.image = image;
	}
	//检查是否出界
	public abstract boolean outOfBounds();
	
	//飞行物移动一步
	public abstract void step();
	
	//检车当前飞行物是否被子弹(x,y)击中
	//子弹对象
	//表示被击中了
	public boolean shootBy(Bullet bullet){
		int x = bullet.x;//子弹横坐标
		int y = bullet.y;//子弹纵坐标
		return this.x < x&& x<this.x+width && this.y < y&& y<this.y+height;
	}
}
