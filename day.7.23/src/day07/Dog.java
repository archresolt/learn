package day07;

public class Dog {
	String name ;
	int age ;
	static String city;
	void main() 
	{
	   Dog.city="广州";  
	   return;  
	}
	public void test01 () {
		System.out.println("普通成员方法"+name+age);
	}
	public static void test02(){
		System.out.println("静态成员方法"+city);
		
	}
	static {
		System.out.println("静态代码块");
	}

}
