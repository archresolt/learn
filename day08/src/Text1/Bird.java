package Text1;

public class Bird extends Animal{
private String color;

	public Bird() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}

	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("����һֻ"+color+"����");
		System.out.println("����"+getAge()+"����");
		System.out.println("��չ�����");
		// TODO �Զ����ɵķ������
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
