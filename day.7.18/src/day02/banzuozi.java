package day02;

import java.util.Scanner;

public class banzuozi {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println ("����������");
		int age = input.nextInt();
		System.out.println("�������Ա�1���� 2��Ů");
		int gender = input.nextInt();
		if (age >= 7) {
			System.out.println("�������7����԰�����");
			
		}else if (age >= 5) {
			if(gender ==1) {
				System.out.println("����5~7����������԰�����");
				
				
			}else{
				System.out.println("����5~7���Ů�����ܰ�����");
				
			}
		}else{
			System.out.println("too young too simple");
		}
		
		
	}

}
 