package day02;

import java.util.Scanner;

public class banzuozi {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println ("请输入年龄");
		int age = input.nextInt();
		System.out.println("请输入性别：1，男 2，女");
		int gender = input.nextInt();
		if (age >= 7) {
			System.out.println("年龄大于7岁可以搬桌子");
			
		}else if (age >= 5) {
			if(gender ==1) {
				System.out.println("年龄5~7岁的男生可以搬桌子");
				
				
			}else{
				System.out.println("年龄5~7岁的女生不能搬桌子");
				
			}
		}else{
			System.out.println("too young too simple");
		}
		
		
	}

}
 