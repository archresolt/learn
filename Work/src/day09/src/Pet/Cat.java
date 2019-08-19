package Pet;

public class Cat extends Pet {

	public Cat() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Cat(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("mao在啃ren");
	}

	@Override
	public void bark() {
		// TODO 自动生成的方法存根
		System.out.println("喵喵喵");
	}

}
