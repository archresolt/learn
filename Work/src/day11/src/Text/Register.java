package Text;

import java.util.Scanner;

public class Register {
	private String name;
	private String psw;

	public void verify() {
		Scanner input = new Scanner(System.in);
		System.out.println("***欢迎进入注册系统***");
		System.out.println("请输入用户名");
		name = input.next();
		System.out.println("请输入密码");
		psw = input.next();

		System.out.println("请再次输入密码");
		String psw01 = input.next();
		if (name.length() < 3 || psw.length() < 6) {
			System.out.println("用户名长度不能小于3，密码长度不能小于6，请重新输入");
			verify();
		}
		if (psw01.equals(psw)==true) {
			System.out.println("注册成功!请牢记用户名和密码。");

		} else {
			System.out.println("两次输入的密码不相同，请重新输入");
			verify();
		}

	}
}
