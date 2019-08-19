package auto;

public class Car extends Auto{

	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, String carColor, int carAge, float carPrice) {
		super(carName, carColor, carAge, carPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float moneyCount(int day) {
		// TODO Auto-generated method stub
		return day * this.getCarPrice();
	}

}
