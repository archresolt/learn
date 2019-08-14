package Pet;

public class Pig extends Pet {

	public Pig() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Pig(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("猪在啃白菜");
	}

	@Override
	public void bark() {
		// TODO 自动生成的方法存根
		System.out.println("哼哼哼");
	}

}
