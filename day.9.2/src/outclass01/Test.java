package outclass01;

import outclass01.OuterClass.InnerClass;

public class Test {
public static void main(String[] args){
	/*
	 * 成员内部类和成员变量可以一起理解
	 * 只有创造出来对象，才会创建成员变量
	 * 所以同样的到里
	 * 只有先创建对象，在内存中才能将成员内部类创建出来
	 * 才能使用成员内部类创建对象
	 */
	OuterClass oc = new OuterClass();
	InnerClass ic = oc.new InnerClass();
	ic.test();
}
}
