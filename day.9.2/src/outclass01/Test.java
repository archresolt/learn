package outclass01;

import outclass01.OuterClass.InnerClass;

public class Test {
public static void main(String[] args){
	/*
	 * ��Ա�ڲ���ͳ�Ա��������һ������
	 * ֻ�д���������󣬲Żᴴ����Ա����
	 * ����ͬ���ĵ���
	 * ֻ���ȴ����������ڴ��в��ܽ���Ա�ڲ��ഴ������
	 * ����ʹ�ó�Ա�ڲ��ഴ������
	 */
	OuterClass oc = new OuterClass();
	InnerClass ic = oc.new InnerClass();
	ic.test();
}
}