package outclass01;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {


	{
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ��͵�����");
		int x = input.nextInt();
		System.out.println("��������Ҫ������η�������");
		int y = input.nextInt();

		for (int i = 0; i < x; i++) {
			x += i;

		}
		int z = y * y * y * y * y;

		System.out.println(
				x);
		System.out.println(z);
	}
}
}