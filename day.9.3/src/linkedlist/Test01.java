package linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test01 {
	public static void main(String[] args) {
		// LinkedList list = new LinkedList();
		LinkedList<String> list = new LinkedList<String>();

		// ����Ԫ��
		list.add("�й�");
		list.add("����");
		list.add("�ձ�");
		list.add("����");
		/*
		 * for (String i : list) { System.out.println(i);
		 * 
		 * }
		 */
		System.out.println(list);
		// ��������ͷβ����Ԫ��
		list.addFirst("����˹");
		list.addLast("�¹�");
		// for (int j = 0; j < list.size(); j++) {
		// System.out.println(list.get(j));
		// }
		System.out.println(list);

		// ����������ͷ��Ԫ��
		// list.getFirst();
		// list.getLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		// ɾ��������������ͷ��Ԫ��
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		// ɾ������Ԫ��
		list.clear();
		System.out.println(list);

		// �ϲ�����
		ArrayList alist = new ArrayList();
		alist.add("����");
		alist.add("����");
		list.addAll(alist);
		System.out.println("LinkedList:" + list);

		Collection clist = new ArrayList<>();
		clist.add("����");
		clist.add("����");
		list.addAll(clist);
		System.out.println("LinkedList:" + list);
		System.out.println(list.getFirst());

		// ʹ�õ��������б���
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("" + iterator.next());
		}
		System.out.println();
		// ע������arralistû��set��������ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ��
		System.out.println("LinkedList:" + list);

	}
}