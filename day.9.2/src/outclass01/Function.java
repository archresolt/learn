package outclass01;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {


	{
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要求和的数字");
		int x = input.nextInt();
		System.out.println("请输入你要求其五次方的数字");
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