package day07;

public class Dog {
	String name ;
	int age ;
	static String city;
	void main() 
	{
	   Dog.city="����";  
	   return;  
	}
	public void test01 () {
		System.out.println("��ͨ��Ա����"+name+age);
	}
	public static void test02(){
		System.out.println("��̬��Ա����"+city);
		
	}
	static {
		System.out.println("��̬�����");
	}

}
