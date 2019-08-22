package auto02;

import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import util.DBUtil;
import util.JdbcTest;

public class Manager {
	Scanner input = new Scanner(System.in);

	public void showMainMenu() {
		System.out.println("欢迎使用尚学堂汽车租赁系统");
		System.out.println("===========================");
		System.out.println("1,租车  2,还车  3,新车入库 4,退出");
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
			System.out.println("程序结束");
			break;
		}
	}
//	租车
	public void getCar(){
		//查询数据库现有的車
		List<Object> list = DBUtil.select("select * from AUTO where state = 1" , "auto02.Auto");
		showAutoArray(list);
		System.out.println("请输入所要租用的车辆的编号");
		int no = input.nextInt();
		Statement stmt = JdbcTest.getStatement();
		String sql = "update auto set state = 0 where carid = " + no;
		stmt.executeUpdate(sql);
	}
}