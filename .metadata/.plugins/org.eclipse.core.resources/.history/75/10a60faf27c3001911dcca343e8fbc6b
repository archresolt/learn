package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Object object = new Dog();
		// 第一种获取反射的方式
		Class cls = Class.forName("reflect.Dog ");
		// 第二种获取反射的方式
		cls = Dog.class;
		// 第三种获取反射的方式
		cls = object.getClass();

		// 通过反射可以创建一个新的实例
		object = cls.newInstance();

		Field[] fs = cls.getDeclaredFields();
		Field fd = fs[0];
		System.out.println(fd.getType().getName());
		// 将object中的fd属性的值设置为wangcai123
		fd.set(object, "wangcai123");
		// 获取object中fd的属性的值
		System.out.println(fd.get(object));

		// 通过反射来获取所有成员方法
		Method[] ms = cls.getDeclaredMethods();
		// 获取到的每一个成员方法都是一个Method的对象
		for (Method method : ms) {
			// 获取方法的名字
			String str = method.getName();
			if ("setName".equals(str)) {
				method.invoke(object, "大黄");

			}
			if ("setAge".equals(str)) {
				method.invoke(object, 20);
			}

		}
		System.out.println(object);
	}
}
