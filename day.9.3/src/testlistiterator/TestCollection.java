package testlistiterator;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		/*
		 * Collection�����д��浥�����ݵ������ĸ��ӿڣ�û��ֱ�ӵ�ʵ���� ���� Ϊ����֤Collection
		 * �еķ�����ʹ��һ��Collection�ӿڵ�����ָ��һ���ӽӿڵ�ʵ����
		 */
		Collection cln = new ArrayList();
		// �����������Ԫ��
		cln.add("one");
		cln.add("two");
		cln.add("three");
		// ��ȡ�����е�Ԫ�ظ���
		System.out.println(cln.size());
		// �������Ԫ��
		Collection cln02 = new ArrayList();
		cln02.addAll(cln);
		System.out.println(cln02.size());
		// �鿴�������Ƿ����ĳ��Ԫ��
		System.out.println(cln.contains("one"));
		// ɾ������
		cln.remove("one");
		System.out.println(cln);
		cln.add("four");
		cln02.add("five");

		// ɾ����ǰ�����Ͳ��������н�����Ԫ��
		cln.removeAll(cln02);
		// �����������������Ĳ���
		cln.retainAll(cln02);
		System.out.println(cln);
	}
}
