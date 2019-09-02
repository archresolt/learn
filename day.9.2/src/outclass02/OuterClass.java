package outclass02;

public class OuterClass {
//外部类的普通成员变量
	private int age = 10 ;
	//外部类的静态成员变量
	static int a  = 30;
	
	//外部类的成员方法
	public void test(){
		System.out.println("外部类的成员方法");
		
	}
	
	
	
	//静态内部类
	static class InnerClass{
		//静态内部类的成员变量
		private static int age02 = 20;
		//静态内部类的成员方法
		public void test02(){
			System.out.println("静态内部类的成员方法" + a);
		}
	}
	
}
