package pet;

public abstract class Pet {
	private String name;
	private int age;
	private int love;
	private int health;

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Pet(String name, int age, int love, int health) {
		super();
		this.name = name;
		this.age = age;
		this.love = love;
		this.health = health;
	}
	
	public abstract void eat();
	public abstract void bark();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
