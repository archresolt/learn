package single;


/*
 * 使用单例方法来创建对象
 * 不管在什么时候  在什么位置  来创建对象  最终得到的都是同一个对象
 * 这种模式叫做单例设计模式
 * 
 */
	
	public class Test{
		public static void main(String[] args){
			Dog wangcai = Dog.createDog();
			System.out.println(wangcai);
			Dog dahuang = Dog.createDog();
			System.out.println(dahuang);
			test();
		}
public static void test(){
	Dog dog = Dog.createDog();
	System.out.println(dog);
}
}
