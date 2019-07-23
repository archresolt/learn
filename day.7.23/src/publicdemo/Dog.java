package publicdemo;

public class Dog {
	private String name;
	private String brand;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setAge(int age) {
		if (age < 0 || age > 20) {
			System.out.println("输入年龄不合法");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}
}
