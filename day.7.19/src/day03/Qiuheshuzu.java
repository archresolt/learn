package day03;

import java.util.Scanner;

//����һ������,�����е�Ԫ�ص�ֵ��ȷ��,���û�¼��,���������е�Ԫ�صĺ�
public class Qiuheshuzu {
	public static void main(String[] args) {
		array();
	}

	public static void array() {
		Scanner sc = new Scanner(System.in);
		double sum = Math.random();
		System.out.println("�����딵�M�L�ȣ�");
		int len = sc.nextInt();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			System.out.println("������������");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println(sum);
	}

}
