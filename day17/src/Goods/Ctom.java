package Goods;

public class Ctom extends Thread {
	private Goods goods;

	public Ctom(Goods goods) {//�����goods����Ϊ�����Ĳ�����
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
