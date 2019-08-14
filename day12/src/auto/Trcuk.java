package auto;

public class Trcuk extends Auto{
	private int t;

	public Trcuk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trcuk(String carName, String carColor, int carAge, float carPrice,
			int t) {
		super(carName, carColor, carAge, carPrice);
		this.t = t;
	}

	@Override
	public float moneyCount(int day) {
		
		return day * this.getCarPrice()*t;
	}
	
	
	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	
}
