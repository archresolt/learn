package Pet;

public class Dog extends Pet{

	public Dog() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Dog(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void eat() {
		System.out.println("狗在啃骨头");
		
	}

	@Override
	public void bark() {
		System.out.println("won won won");
		
		
	}


}
