package banzhuozi;

import java.util.Scanner;

public class Banzhuozi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("7����������Ů�������԰����ӣ�5~7��ֻ���������԰����ӣ�5�����¶������԰�����");
		System.out.println("����������");
		int i = input.nextInt();
		System.out.println("�������Ա�" + "1,��  2,Ů");
		int j = input.nextInt();
		if (i > 7) {
			System.out.println("�����ԣ�������");

		} else if (i >= 5) {
			if (j == 1) {
				System.out.println("5~7����������԰�����");
			} else {
				System.out.println("5~7���Ů�������԰�����");
			}
		} else {
			System.out.println("С�����겻���԰�����");
		}
	}
}