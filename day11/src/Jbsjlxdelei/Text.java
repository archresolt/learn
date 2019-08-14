package Jbsjlxdelei;

public class Text {
	public static void main(String[] args) {
	
		
		
		

		int i = 10;
		Integer it = new Integer(i);// Text变成Integer会怎么样
		Integer it02 = Integer.valueOf("12");
		// 将包装类的对象转换为基本数据类型
		int i2 = it.intValue();

		// 基本数据类型的变量可以直接转换为包装类的对象
		Integer it03 = /* int */10;// 等同于Integer it = new Integer(10);

		//引用数据类型可以直接转换成基本数据类型的变量
		int i3 = it;//等同于int i2 = it.intValue();
	}

}
