package pet;

public class Cat extends Pet{
	private String color;

	public Cat(String name, int age, int love, int health, String color) {
		super(name, age, love, health);
		this.color = color;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("√®‘⁄≥‘”„");
	}

	@Override
	public void bark() {
		System.out.println("miao miao miao");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
