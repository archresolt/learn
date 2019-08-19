package Text1;

public class Fish extends Animal {
    private int w;
    


	public Fish() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Fish(int age, int w) {
		super(age);
		this.w = w;
	}



	@Override
	public void show() {
		System.out.println("我是一只"+w+"斤重的鱼");
		System.out.println("今年"+getAge()+"岁了");
		System.out.println("我在水里悠闲地吐泡");
		// TODO 自动生成的方法存根
	
		
}
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

}