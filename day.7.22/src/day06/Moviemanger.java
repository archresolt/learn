package day06;

//������  ������������
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Moviemanger {
	Movie[] ms = new Movie[10];
	// ����һ����Ӱ����������ŵ�Ӱ
	Scanner input = new Scanner(System.in);

	// ����һ��Scanner�ĳ�Ա����������ʼ����������

	public void showMainMenu() {
		System.out.println("��ӭ���ٺ��Ӱ�ӳ�");
		System.out.println("---------------------");
		/*
		 * System.out.println("�������Ӱ����"); System.out.println("�������Ӱ����");
		 * System.out.println("�������Ӱʱ��");
		 */
		System.out.println("1��������Ӱ");
		System.out.println("2���鿴��Ӱ");
		System.out.println("3��ɾ����Ӱ");
		System.out.println("4���˳�");
		System.out.println("----------------------");
		System.out.println("��ѡ��");
		int type = input.nextInt();

		switch (type) {
		case 1:
			add();
			break;

		case 2:
			select();
			break;

		case 3:
			delete();
			break;

		default:

			break;

		}
	}

	public void backMainMenu() {
		System.out.println("������0�������˵�");
		int i = input.nextInt();
		if (i == 0) {
			showMainMenu();
		} else {
			// System.out.println("������0�������˵�");
			backMainMenu();
		}
	}

	public void add() {
		System.out.println("�������Ӱ������");
		String name = input.next();
		System.out.println("�������Ӱ�ĵ���");
		String drt = input.next();
		System.out.println("�������Ӱ������");
		String main = input.next();
		System.out.println("�������Ӱ��ʱ��");
		int time = input.nextInt();
		// ���Զ��˶����
		// ����һ��Movie�Ķ�����������ⲿ��Ӱ����Ϣ
		Movie m = new Movie();
		m.movieName = name;
		m.movieDrt = drt;
		m.movieMain = main;
		m.movieTime = time;
		// [1][1][1][1][0][0][0][0]
		// �ҵ���Ӱ�����е�һ��Ϊnull��λ�ã���λ�þ��ǵ�Ӱ����Ӧ�ô�ŵ�λ��
		int index = 0;
		for (int i = 0; i < ms.length; i++) {
			// ����i��<����ĳ���
			if (ms[i] == null) {
				index = i;
				break;
			}
			// ms[index] = m;���˴��������ѭ������
		}
		// ѭ�������󣬽�������Ӱ�Ķ������index��λ��
		ms[index] = m;
		backMainMenu();

	}

	public void delete() {
		System.out.println("��������Ҫɾ����Ӱ������");
		String movieName = input.next();
		// [1][1][1][1][0][0][0]
		int index = -1;
		for (int i = 0; i < ms.length; i++) {
			Movie m = ms[i];
			// �ص�����,ע�����
			if (m.movieName.equals(movieName)) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("����Ҫɾ���ĵ�Ӱ������");
		} else {
			ms[index] = null;
			for (int j = index; j < ms.length - 1; j++) {
				// [1][1][1][1][0][0][0]
				// ms[j+1]=ms[j];����
				ms[j] = ms[j + 1];
			}
			ms[ms.length - 1] = null;// ��ֹ��ʼ��Ӱ�����������ģ��������һ��û�������ǡ���

		}

	}

	public void select() {
		System.out.println("��Ӱ��\t\t  ����\t\t  ����\t\t  ʱ��");
		for (int i = 0; i < ms.length; i++) {
			Movie m = ms[i];
			if (m == null) {
				break;
			}
			System.out.println(m.movieName + "\t\t" + m.movieDrt + "\t\t"
					+ m.movieMain + "\t\t" + m.movieTime);

		}

	}
}

/*
 * public void add() {
 * 
 * }
 * 
 * public void delete() {
 * 
 * }
 * 
 * public void find() {
 * 
 * }
 * 
 * ArrayList i = new ArrayList();
 * 
 * public static void main(String[] args123123) { String[] x = new String[4];
 * ArrayList test = new ArrayList(); for (int i = 0; i < 1000; i++) {
 * test.add("��" + i + "��Ԫ��"); } System.out.println(test.get(0));
 * 
 * // for (Object j : test) { // System.out.println(j); // // } // for (int i =
 * 0; i < test.size(); i++) { // System.out.println(test.get(i)); // }
 * 
 * Map map = new HashMap(); map.put("����", "С��"); map.put("����", 123); map.put(3,
 * new ArrayList());
 * 
 * map.remove(3);
 * 
 * System.out.println(map);
 * 
 * }
 */
