package day07;

import java.util.Scanner;

public class MovieManager {
	// ����һ����Ӱ���͵�����ĳ�Ա������������ŵ�Ӱ������
	Movie[] ms = new Movie[10];
	// ����һ��Scanner�ĳ�Ա����������ʼ������������
	Scanner input = new Scanner(System.in);
	Movie m = new Movie();

	public void showMainMenu() {

		System.out.println("��ӭ���ٺ���Ӱ��");
		System.out.println("------------------");
		System.out.println("1,������Ӱ");
		System.out.println("2,�鿴��Ӱ");
		System.out.println("3,ɾ����Ӱ");
		System.out.println("4,�˳�");
		System.out.println("------------------");
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

	public void add() {
		System.out.println("�������Ӱ����");
		String name = input.next();

		System.out.println("�������Ӱ���ݣ�");
		String dre = input.next();

		System.out.println("�������Ӱ���ݣ�");
		String main = input.next();

		System.out.println("�������Ӱʱ��");
		int time = input.nextInt();
		m.movieName = name;
		m.movieDrt = dre;
		m.movieMain = main;
		m.movieTime = time;
		//[1][1][1][1][0][0][0]
		//�ҵ������һ��Ϊnull��λ�ã���λ�þ��ǵ�Ӱ����ô�ŵ�λ��
		int index = 0;
		for (int i = 0; i < ms.length; i++) {
			Movie movie = ms[i];
			if (movie == null) {
				index = i;
				break;
			}
		}
		//ѭ�������󣬽������ĵ�Ӱ�������index��λ��
		ms[index]= m;
		

	}

	public void delete() {
		//��������Ҫɾ����Ӱ������
		String mo

	}

	public void select() {

	}

}
