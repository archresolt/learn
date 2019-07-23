package day07;

import java.util.Scanner;

public class MovieManager {
	// 创建一个电影类型的数组的成员变量，用来存放电影的数据
	Movie[] ms = new Movie[10];
	// 创建一个Scanner的成员变量，并初始化，用来输入
	Scanner input = new Scanner(System.in);
	Movie m = new Movie();

	public void showMainMenu() {

		System.out.println("欢迎光临横店电影城");
		System.out.println("------------------");
		System.out.println("1,新增电影");
		System.out.println("2,查看电影");
		System.out.println("3,删除电影");
		System.out.println("4,退出");
		System.out.println("------------------");
		System.out.println("请选择");
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
		System.out.println("请输入电影名：");
		String name = input.next();

		System.out.println("请输入电影导演：");
		String dre = input.next();

		System.out.println("请输入电影主演：");
		String main = input.next();

		System.out.println("请输入电影时长");
		int time = input.nextInt();
		m.movieName = name;
		m.movieDrt = dre;
		m.movieMain = main;
		m.movieTime = time;
		//[1][1][1][1][0][0][0]
		//找到数组第一个为null的位置，该位置就是电影对象该存放的位置
		int index = 0;
		for (int i = 0; i < ms.length; i++) {
			Movie movie = ms[i];
			if (movie == null) {
				index = i;
				break;
			}
		}
		//循环结束后，将新增的电影对象存入index的位置
		ms[index]= m;
		

	}

	public void delete() {
		//请输入需要删除电影的名字
		String mo

	}

	public void select() {

	}

}
