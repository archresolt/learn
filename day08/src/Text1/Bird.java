package Text1;

public class Bird extends Animal{
private String color;

	public Bird() {
	super();
	// TODO 自动生成的构造函数存根
}

	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("我是一只"+color+"的鸟");
		System.out.println("今年"+getAge()+"岁了");
		System.out.println("我展翅高翔");
		// TODO 自动生成的方法存根
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
