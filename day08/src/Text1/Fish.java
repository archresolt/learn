package Text1;

public class Fish extends Animal {
    private int w;
    


	public Fish() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Fish(int age, int w) {
		super(age);
		this.w = w;
	}



	@Override
	public void show() {
		System.out.println("����һֻ"+w+"���ص���");
		System.out.println("����"+getAge()+"����");
		System.out.println("����ˮ�����е�����");
		// TODO �Զ����ɵķ������
	
		
}
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

}