package day03;

import java.util.Scanner;

public class Caishuzi {
	public static void guessno(){
		int no = (int)(Math.random()*11);
		System.out.println("�����");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("�������"+no);
		if (no == number) {
			System.out.println("��ϲ�㣬������");
			
		}else{
			System.out.println("û����");
		}
		
		
	}

}

