package auto02;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.DBUtil;

import util.JdbcTest;

public class Manager {

	Scanner input = new Scanner(System.in);

	public void shouMainMenu() {
		System.out.println("欢迎使用尚学堂汽车租赁系统");
		System.out.println("================================");
		System.out.println("1,租车 2,还车 3,新车入库 4,退出");
		int flag = input.nextInt();
		switch (flag) {
		case 1:
			getCar();
			shouMainMenu();
			break;
		case 2:
			backCar();
			shouMainMenu();
			break;
		case 3:
			newCar();
			shouMainMenu();
			break;

		default:
			System.out.println("程序结束");
			break;
		}

	}

	/**
	 * 租车
	 */
	public void getCar() {
		// 查询出来数据库中现有的车
		List<Object> list = DBUtil.select("select * from AUTO where state = 1",
				"auto02.Auto");
		showAutoArray(list);
		System.out.println("请输入索要租用的车辆得编号");
		int no = input.nextInt();
		Statement stmt = JdbcTest.getStatement();
		String sql = "update auto set state = 0 where carid = " + no;
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 查询出来数据库中现有的车
		list = DBUtil.select("select * from AUTO where state = 1",
				"auto02.Auto");
		showAutoArray(list);

	}

	/**
	 * 还车
	 */
	public void backCar() {
		// 查询出来数据库中现有的车
		List<Object> list = DBUtil.select("select * from AUTO where state = 0",
				"auto02.Auto");
		showAutoArray(list);
		System.out.println("请输入要还的车辆编号");
		int index = input.nextInt();
		System.out.println("请输入所租用的天数");
		int day = input.nextInt();
		Auto auto = null;
		for (int i = 0; i < list.size(); i++) {
			auto = (Auto)list.get(i);
			if (index == auto.getCarid()) {
				break;
			}
		}
		System.out.println("您需要支付"+day*auto.getCarPrice());
		Statement stmt = JdbcTest.getStatement();
		String sql = "update auto set state = 1 where carid = " + index;
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 list = DBUtil.select("select * from AUTO where state = 0",
				"auto02.Auto");
		showAutoArray(list);
	}

	// /**
	// * 新车入库
	// */
	public void newCar() {
		
		System.out.println("请输入车辆id");
		int carID = input.nextInt();
		System.out.println("请输入汽车类型");
		String carName = input.next();
		System.out.println("请输入车辆颜色");
		String carColor = input.next();
		System.out.println("请输入车辆年限");
		int carAge = input.nextInt();
		System.out.println("请输入日租金");
		float carPrice = input.nextFloat();
		System.out.println("卡车请输入吨位");
		int t = input.nextInt();
		
		Auto auto = new Auto(carID, carName, carColor, carAge, carPrice, t);
		DBUtil.insert(auto);
		
		
	}

	/**
	 * 展示车辆信息的方法
	 * 
	 * @param auto
	 */
	public void showAutoArray(List<Object> list) {
		System.out.println("车辆编号\t车名\t颜色\t使用年限\t日租金\t卡车载重");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
	}

	/**
	 * 向数组中添加元素的方法
	 */
	public void addAuto(Auto auto, Auto[] as) {
		// 将用户换回来的车存入到inCar数组中
		int n = 0;
		for (int i = 0; i < as.length; i++) {
			Auto at = as[i];
			if (at == null) {
				n = i;
				break;
			}

		}
		as[n] = auto;

	}

	/**
	 * 从数组中删除元素
	 * 
	 */
	public void deleteAuto(Auto[] as, int index) {
		as[index] = null;
		for (int i = index; i < as.length - 1; i++) {
			as[index] = as[index + 1];
		}
		as[as.length - 1] = null;

	}

}
