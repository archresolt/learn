package Ëæ»úÊı;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i <= 5; i++) {
			int num1 = random.nextInt(10);
			int num2 = 1 + random.nextInt(10);

			System.out.println(num1);
			System.out.println(num2);
		}
	}
}
