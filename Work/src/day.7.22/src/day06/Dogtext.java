package day06;

import java.util.Scanner;

public class Dogtext {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ���������");
		System.out.println("��������������");
		String name = input.next();
		System.out.println("����������Ʒ��1,��ʿ��,2,��ë");
		int brand = input.nextInt();
		System.out.println("�����빷�Ľ���ֵ");
		int health = input.nextInt();

		Dog wangcai = new Dog();
		wangcai.name = name;
		if (brand == 1) {
			wangcai.brand = "��ʿ��";

		} else {
			wangcai.brand = "��ë";

		}
		if (health <= 0 || health >= 100) {
			System.out.println("���뽡��ֵ����");
			wangcai.health = 60;

		} else {
			wangcai.health = health;

		}
		wangcai.print();

	}

}
