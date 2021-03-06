package linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test01 {
	public static void main(String[] args) {
		// LinkedList list = new LinkedList();
		LinkedList<String> list = new LinkedList<String>();

		// 添加元素
		list.add("中国");
		list.add("美国");
		list.add("日本");
		list.add("法国");
		/*
		 * for (String i : list) { System.out.println(i);
		 * 
		 * }
		 */
		System.out.println(list);
		// 在链表的头尾添加元素
		list.addFirst("俄罗斯");
		list.addLast("德国");
		// for (int j = 0; j < list.size(); j++) {
		// System.out.println(list.get(j));
		// }
		System.out.println(list);

		// 返回链表开头的元素
		// list.getFirst();
		// list.getLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		// 删除并返回链表开头的元素
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		// 删除所有元素
		list.clear();
		System.out.println(list);

		// 合并集合
		ArrayList alist = new ArrayList();
		alist.add("非洲");
		alist.add("亚洲");
		list.addAll(alist);
		System.out.println("LinkedList:" + list);

		Collection clist = new ArrayList<>();
		clist.add("地球");
		clist.add("火星");
		list.addAll(clist);
		System.out.println("LinkedList:" + list);
		System.out.println(list.getFirst());

		// 使用迭代器进行遍历
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("" + iterator.next());
		}
		System.out.println();
		// 注意区别arralist没有set方法，用指定的元素替代此列表中指定位置上的元素
		System.out.println("LinkedList:" + list);

	}
}