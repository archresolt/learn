package outclass03;

public class OuterClass {
//外部类的方法
	public void test(){
		
	
	//方法中的内部类
	//public InnerClass{
		class InnerClass{
		//内部类的方法
		public void test02(){
			System.out.println("内部类的方法");
		}
	}
	new InnerClass().test02();
	}
}
