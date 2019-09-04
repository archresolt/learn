package testlistiterator;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		/*
		 * Collection是所有储存单个数据的容器的父接口，没有直接的实现类 所以 为了验证Collection
		 * 中的方法，使用一个Collection接口的引用指向一个子接口的实现类
		 */
		Collection cln = new ArrayList();
		// 向容器中添加元素
		cln.add("one");
		cln.add("two");
		cln.add("three");
		// 获取容器中的元素个数
		System.out.println(cln.size());
		// 批量添加元素
		Collection cln02 = new ArrayList();
		cln02.addAll(cln);
		System.out.println(cln02.size());
		// 查看容器中是否包含某个元素
		System.out.println(cln.contains("one"));
		// 删除对象
		cln.remove("one");
		System.out.println(cln);
		cln.add("four");
		cln02.add("five");

		// 删除当前容器和参数容器中交集的元素
		cln.removeAll(cln02);
		// 保留两个容器交集的部分
		cln.retainAll(cln02);
		System.out.println(cln);
	}
}
