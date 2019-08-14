package Zuche;

public class Truck extends Auto {
	private int t;

	public Truck() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Truck(String id, String brand, int t) {
		super(id, brand);
		this.t = t;
	}

	@Override
	public int moneyCount(int d) {
		
		// TODO 自动生成的方法存根
		return 50*t*d;
	}

	
	
	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

}
