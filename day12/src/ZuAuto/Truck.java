package ZuAuto;

public class Truck extends Auto  {

	private int t;
	@Override
	public float moneyCount(int day) {
		// TODO �Զ����ɵķ������
		return 0;
		
		
	}

	public Truck() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Truck(String carName, String carColor, int carAge, float carPrice,
			int t) {
		super(carName, carColor, carAge, carPrice);
		this.t = t;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	
	


}
