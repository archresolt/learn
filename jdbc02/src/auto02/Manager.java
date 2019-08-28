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
		System.out.println("��ӭʹ����ѧ����������ϵͳ");
		System.out.println("================================");
		System.out.println("1,�⳵ 2,���� 3,�³���� 4,�˳�");
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
			System.out.println("�������");
			break;
		}

	}

	/**
	 * �⳵
	 */
	public void getCar() {
		// ��ѯ�������ݿ������еĳ�
		List<Object> list = DBUtil.select("select * from AUTO where state = 1",
				"auto02.Auto");
		showAutoArray(list);
		System.out.println("��������Ҫ���õĳ����ñ��");
		int no = input.nextInt();
		Statement stmt = JdbcTest.getStatement();
		String sql = "update auto set state = 0 where carid = " + no;
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ѯ�������ݿ������еĳ�
		list = DBUtil.select("select * from AUTO where state = 1",
				"auto02.Auto");
		showAutoArray(list);

	}

	/**
	 * ����
	 */
	public void backCar() {
		// ��ѯ�������ݿ������еĳ�
		List<Object> list = DBUtil.select("select * from AUTO where state = 0",
				"auto02.Auto");
		showAutoArray(list);
		System.out.println("������Ҫ���ĳ������");
		int index = input.nextInt();
		System.out.println("�����������õ�����");
		int day = input.nextInt();
		Auto auto = null;
		for (int i = 0; i < list.size(); i++) {
			auto = (Auto)list.get(i);
			if (index == auto.getCarid()) {
				break;
			}
		}
		System.out.println("����Ҫ֧��"+day*auto.getCarPrice());
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
	// * �³����
	// */
	public void newCar() {
		
		System.out.println("�����복��id");
		int carID = input.nextInt();
		System.out.println("��������������");
		String carName = input.next();
		System.out.println("�����복����ɫ");
		String carColor = input.next();
		System.out.println("�����복������");
		int carAge = input.nextInt();
		System.out.println("�����������");
		float carPrice = input.nextFloat();
		System.out.println("�����������λ");
		int t = input.nextInt();
		
		Auto auto = new Auto(carID, carName, carColor, carAge, carPrice, t);
		DBUtil.insert(auto);
		
		
	}

	/**
	 * չʾ������Ϣ�ķ���
	 * 
	 * @param auto
	 */
	public void showAutoArray(List<Object> list) {
		System.out.println("�������\t����\t��ɫ\tʹ������\t�����\t��������");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
	}

	/**
	 * �����������Ԫ�صķ���
	 */
	public void addAuto(Auto auto, Auto[] as) {
		// ���û��������ĳ����뵽inCar������
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
	 * ��������ɾ��Ԫ��
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
