package Text;

import java.util.Scanner;

public class Register {
	private String name;
	private String psw;

	public void verify() {
		Scanner input = new Scanner(System.in);
		System.out.println("***��ӭ����ע��ϵͳ***");
		System.out.println("�������û���");
		name = input.next();
		System.out.println("����������");
		psw = input.next();

		System.out.println("���ٴ���������");
		String psw01 = input.next();
		if (name.length() < 3 || psw.length() < 6) {
			System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6������������");
			verify();
		}
		if (psw01.equals(psw)==true) {
			System.out.println("ע��ɹ�!���μ��û��������롣");

		} else {
			System.out.println("������������벻��ͬ������������");
			verify();
		}

	}
}
