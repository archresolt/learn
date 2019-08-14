package Dalisheji;

import java.util.Scanner;

public class Login {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入用户名");
		String userName = input.next();
		System.out.println("请输入密码");
		String psw= input.next();
		
		
		UserInfo info = UserInfo.getUserInfo();
		info.setPsw(psw);
		//setPsw是在哪里调用的方法？
		info.setUserName(userName);
		GoodList.list();
	}

}
