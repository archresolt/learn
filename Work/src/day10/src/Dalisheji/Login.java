package Dalisheji;

import java.util.Scanner;

public class Login {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("�������û���");
		String userName = input.next();
		System.out.println("����������");
		String psw= input.next();
		
		
		UserInfo info = UserInfo.getUserInfo();
		info.setPsw(psw);
		//setPsw����������õķ�����
		info.setUserName(userName);
		GoodList.list();
	}

}
