package outclass02;

import outclass02.OuterClass.InnerClass;

public class Test {
public void main (String[] args){
	/*
	 * 静态内部类相当于是静态成员变量
	 * 都是在加载类的时候就直接定义出来了
	 * 都是可以使用外部类的名字  直接调用内部类 来创建对象
	 */
	InnerClass ic = new OuterClass.InnerClass();
}
}
