package auto02;

import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import util.DBUtil;
import util.JdbcTest;

public class Manager {
	Scanner input = new Scanner(System.in);

	public void showMainMenu() {
		System.out.println("��ӭʹ����ѧ����������ϵͳ");
		System.out.println("===========================");
		System.out.println("1,�⳵  2,����  3,�³���� 4,�˳�");
		int flag = input.nextInt();
		switch (flag) {
		case 1:
			getCar();
			showMainMenu();
			break;

		case 2:
			backCar();
			showMainMenu();
			break;

		case 3:
			newCar();
			showMainMenu();
			break;
		default:
			System.out.println("�������");
			break;
		}
	}
//	�⳵
	public void getCar(){
		//��ѯ���ݿ����е�܇
		List<Object> list = DBUtil.select("select * from AUTO where state = 1" , "auto02.Auto");
		showAutoArray(list);
		System.out.println("��������Ҫ���õĳ����ı��");
		int no = input.nextInt();
		Statement stmt = JdbcTest.getStatement();
		String sql = "update auto set state = 0 where carid = " + no;
		stmt.executeUpdate(sql);
	}
}