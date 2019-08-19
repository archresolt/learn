package day06;

import java.util.Scanner;

public class Dogtext {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物店");
		System.out.println("请输入宠物的名字");
		String name = input.next();
		System.out.println("请输入宠物的品种1,哈士奇,2,金毛");
		int brand = input.nextInt();
		System.out.println("请输入狗的健康值");
		int health = input.nextInt();

		Dog wangcai = new Dog();
		wangcai.name = name;
		if (brand == 1) {
			wangcai.brand = "哈士奇";

		} else {
			wangcai.brand = "金毛";

		}
		if (health <= 0 || health >= 100) {
			System.out.println("输入健康值有误");
			wangcai.health = 60;

		} else {
			wangcai.health = health;

		}
		wangcai.print();

	}

}
