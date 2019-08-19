package day03;

import java.util.Scanner;

public class Caishuzi {
	public static void guessno(){
		int no = (int)(Math.random()*11);
		System.out.println("请猜数");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("随机数是"+no);
		if (no == number) {
			System.out.println("恭喜你，猜中了");
			
		}else{
			System.out.println("没猜中");
		}
		
		
	}

}

