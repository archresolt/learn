package Zifuchuan;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//�ַ����ĳ��÷���
		String str = "���������ַ���";
		//ͨ���±��ȡ�ַ����е�ĳһ���ַ�
		System.out.println(str.charAt(0));
		//��ȡָ���±���ַ���unicode����ֵ
		System.out.println(str.codePointAt(0));
		
		String str01 = new String();
		str01 = "abcdefg";
		String str02 = "Abc";
		//System.out.println(str01);
		
		//�ַ����Ƚϴ�С
		System.out.println(str01.compareTo(str02));
		//�����Ǵ�Сд�Ƚ��ַ���
		System.out.println(str01.compareToIgnoreCase(str02));
		//��ԭ�ַ�����׷��һ���µ��ַ���������һ���µ��ַ�������
		String str03 = str01.concat("123");
		//�ж�Ŀ���Ƿ�����ڵ�ǰ�ַ�����
		System.out.println(str03.contains("123"));
		
		//����һ���µ����飬���ַ�����ָ����Χ���Ը��������ַ������У��������ĳ���±�ʼ���
		char[] ch = new char[10];
		str01.getChars(2,4,ch,4);
		System.out.println(Arrays.toString(ch));
		
		//�ַ����Ĳ��ң����ҵ�һ�γ��ֵ�λ�õ��±�
		int index = str03.indexOf("b");
		System.out.println(index);
		
		//�ַ��滻
		System.out.println(str01.replace('b','g'));
		
		
	}

}
