package day03;

import java.util.Scanner;

//3.������Ϸ,�Ӽ�������������һ���� �ж������а��������ֵĴ���

public class Caishuyouxi {
	public static void main (String[] args){
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("�����룺");
		int input =sc.nextInt();
		int [] array = new int[]{1,3,4,5,6,4,5,7,8,8,6,6,3,9,9,3};
		int count =0;
		for (int i:array){
			if (i == input) {
				count++;
				
			}
		}
		System.out.println("�������"+input+"������"+ count+"��");
		
		
	
	}
}
