package banzhuozi;

import java.util.Scanner;

public class Banzhuozi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("7岁以上男生女生都可以搬桌子，5~7岁只有男生可以搬桌子，5岁以下都不可以搬桌子");
		System.out.println("请输入年龄");
		int i = input.nextInt();
		System.out.println("请输入性别" + "1,男  2,女");
		int j = input.nextInt();
		if (i > 7) {
			System.out.println("都可以，你随意");

		} else if (i >= 5) {
			if (j == 1) {
				System.out.println("5~7岁的男生可以搬桌子");
			} else {
				System.out.println("5~7岁的女生不可以搬桌子");
			}
		} else {
			System.out.println("小于五岁不可以搬桌子");
		}
	}
}