package day03;

import java.util.Scanner;

//给定一个数组,数组中的元素的值不确定,由用户录入,计算数组中的元素的和
public class Qiuheshuzu {
	public static void main(String[] args) {
		array();
	}

	public static void array() {
		Scanner sc = new Scanner(System.in);
		double sum = Math.random();
		System.out.println("请输入數組長度：");
		int len = sc.nextInt();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入整数：");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println(sum);
	}

}
