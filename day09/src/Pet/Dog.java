package Pet;

public class Dog extends Pet{

	public Dog() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Dog(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void eat() {
		System.out.println("���ڿй�ͷ");
		
	}

	@Override
	public void bark() {
		System.out.println("won won won");
		
		
	}


}
