package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Object object = new Dog();
		// ��һ�ֻ�ȡ����ķ�ʽ
		Class cls = Class.forName("reflect.Dog ");
		// �ڶ��ֻ�ȡ����ķ�ʽ
		cls = Dog.class;
		// �����ֻ�ȡ����ķ�ʽ
		cls = object.getClass();

		// ͨ��������Դ���һ���µ�ʵ��
		object = cls.newInstance();

		Field[] fs = cls.getDeclaredFields();
		Field fd = fs[0];
		System.out.println(fd.getType().getName());
		// ��object�е�fd���Ե�ֵ����Ϊwangcai123
		fd.set(object, "wangcai123");
		// ��ȡobject��fd�����Ե�ֵ
		System.out.println(fd.get(object));

		// ͨ����������ȡ���г�Ա����
		Method[] ms = cls.getDeclaredMethods();
		// ��ȡ����ÿһ����Ա��������һ��Method�Ķ���
		for (Method method : ms) {
			// ��ȡ����������
			String str = method.getName();
			if ("setName".equals(str)) {
				method.invoke(object, "���");

			}
			if ("setAge".equals(str)) {
				method.invoke(object, 20);
			}

		}
		System.out.println(object);
	}
}
