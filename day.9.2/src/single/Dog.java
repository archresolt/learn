package single;

public class Dog {
//��dog����ʵ��һ���������ģʽ
	static Dog dog = null;
	//ֻҪ�Ǵ�������ͱ���Ҫͨ���÷���������
	public static Dog createDog(){
		if(dog == null){
			dog = new Dog();
		}
		return dog;
	}
}
