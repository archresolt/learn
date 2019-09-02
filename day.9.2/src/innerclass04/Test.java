package innerclass04;

public class Test {
/*
 * 匿名内部类
 * 直接通过接口或者抽象类来new对象
 * 接口和抽象类不能直接创建对象，所以在创建对象之前，先将接口或者抽象类，实现成一个内部类
 * 该内部类没有名字，所以称之为匿名内部类
 * 
 * 使用场景
 * 当一个接口的实现类，只需要使用一次，这个时候可以将接口实现成一个匿名内部类
 * 
 */
	
		public static void main (String[] args){
			MyInterface mi = new MyInterface() {

				@Override
				public void test() {
					// TODO 自动生成的方法存根
					System.out.println("匿名内部类的方法");
				}
				
			
		};
		mi.test();
	}
}
