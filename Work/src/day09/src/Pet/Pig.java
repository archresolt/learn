package Pet;

public class Pig extends Pet {

	public Pig() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Pig(String name, int age, int love, int health) {
		super(name, age, love, health);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("���ڿаײ�");
	}

	@Override
	public void bark() {
		// TODO �Զ����ɵķ������
		System.out.println("�ߺߺ�");
	}

}
