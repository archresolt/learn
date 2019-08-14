package pet;

public class Dog extends Pet{
	private String brand;
	

	public Dog() {
		super();
	}

	public Dog(String name, int age, int love, int health, String brand) {
		super(name, age, love, health);
		this.brand = brand;
	}


	@Override
	public void eat() {
		System.out.println("¹·ÔÚ³Ô¹ÇÍ·");
	}

	@Override
	public void bark() {
		System.out.println("won won won");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
