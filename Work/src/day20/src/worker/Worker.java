package worker;

public class Worker {
	private String name;
	private int age;
	private int salary;

	public Worker() {
		super();
		// TODO �Զ����ɵĹ��캯�����

	}

	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void test() {

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "Name:" + name + " Age:" + age + " Salary:" + salary;
	}
}
