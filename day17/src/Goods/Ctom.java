package Goods;

public class Ctom extends Thread {
	private Goods goods;

	public Ctom(Goods goods) {//这里的goods是作为方法的参数吗
		super();
		this.goods = goods;
	}
	public void run(){
		for (int i = 0 ;i<10;i++){
			goods.ctom();
		}
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}
