package auto02;

public class Auto {
	public int carid;
	public String carName;
	public String carColor;
	public int carAge;
	public float carPrice;
	public int t;
	public Auto(){
		super();
	}
	public Auto (int carid, String carName, String carColor, int carAge, float carPrice, int t ){
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.carAge = carAge;
		this.carPrice = carPrice;
		this.t = t;
		this.carid = carid;
	}
	public float moneyCount(int day){
		return this.carPrice * day;
	}
	
	public String getCarName(){
		return carName;
	}
	public void setCarName(String carName){
		this.carName = carName ;
	}
	public String getCarColor(){
		return carColor;
	}
	public void setCarColor(){
		this.carColor = carColor;
	}
	public float getCarPrice(){
		return carPrice;
	}
	public void setCarPrice(){
		this.carPrice = carPrice;
	}
	public int getCarAge(){
		return carAge;
	}
	public void setCarAge(){
		this.carAge = carAge;
	}
	public int getT(){
		return t;
	}
	public void setT(){
		this.t = t;
	}
	public int getCarid(){
		return carid;
	}
	public void setCarid(){
		this.carid = carid;
	}
	public String toString(){
		return carid + "\t" + carName + "\t" + carColor + "\t" + carAge + "\t" +carPrice + "\t" + t;
	}
}
