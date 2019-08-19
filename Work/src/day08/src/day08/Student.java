package day08;

public class Student {
	private String name ;
	private int Stuid;
	private int age;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String name, int stuid, int age) {
		super();
		this.name = name;
		Stuid = stuid;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuid() {
		return Stuid;
	}
	public void setStuid(int stuid) {
		Stuid = stuid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
