package auto;

public abstract class Auto {
	private String carName;
	private String carColor;
	private int carAge;
	private float carPrice;
	public Auto() {
		super();
	}
	
	public Auto(String carName, String carColor, int carAge, float carPrice) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.carAge = carAge;
		this.carPrice = carPrice;
	}
	public abstract float moneyCount(int day);
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarAge() {
		return carAge;
	}
	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}
	public float getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return  carName + "\t" + carColor
				+ "\t" + carAge + "\t" + carPrice ;
	}

	
}
