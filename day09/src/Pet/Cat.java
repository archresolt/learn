package Pet;

public class Cat extends Pet {

	public Cat() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Cat(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("mao�ڿ�ren");
	}

	@Override
	public void bark() {
		// TODO �Զ����ɵķ������
		System.out.println("������");
	}

}
