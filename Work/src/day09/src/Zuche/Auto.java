package Zuche;

public abstract class Auto {
	private String id;
	private String brand;
	public Auto() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Auto(String id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	
	
	public abstract int moneyCount(int d) ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
