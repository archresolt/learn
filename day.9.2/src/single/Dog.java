package single;

public class Dog {
//对dog的类实现一个单例设计模式
	static Dog dog = null;
	//只要是创建对象就必须要通过该方法来创建
	public static Dog createDog(){
		if(dog == null){
			dog = new Dog();
		}
		return dog;
	}
}
