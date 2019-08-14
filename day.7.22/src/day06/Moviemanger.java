package day06;

//工具类  用来处理数据
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Moviemanger {
	Movie[] ms = new Movie[10];
	// 创建一个电影的数组来存放电影
	Scanner input = new Scanner(System.in);

	// 创建一个Scanner的成员变量，并初始化用于输入

	public void showMainMenu() {
		System.out.println("欢迎光临横店影视城");
		System.out.println("---------------------");
		/*
		 * System.out.println("请输入电影导演"); System.out.println("请输入电影主演");
		 * System.out.println("请输入电影时长");
		 */
		System.out.println("1，新增电影");
		System.out.println("2，查看电影");
		System.out.println("3，删除电影");
		System.out.println("4，退出");
		System.out.println("----------------------");
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

	public void backMainMenu() {
		System.out.println("请输入0返回主菜单");
		int i = input.nextInt();
		if (i == 0) {
			showMainMenu();
		} else {
			// System.out.println("请输入0返回主菜单");
			backMainMenu();
		}
	}

	public void add() {
		System.out.println("请输入电影的名字");
		String name = input.next();
		System.out.println("请输入电影的导演");
		String drt = input.next();
		System.out.println("请输入电影的主演");
		String main = input.next();
		System.out.println("请输入电影的时长");
		int time = input.nextInt();
		// 属性多了对象存
		// 创建一个Movie的对象，用来存放这部电影的信息
		Movie m = new Movie();
		m.movieName = name;
		m.movieDrt = drt;
		m.movieMain = main;
		m.movieTime = time;
		// [1][1][1][1][0][0][0][0]
		// 找到电影数组中第一个为null的位置，该位置就是电影数组应该存放的位置
		int index = 0;
		for (int i = 0; i < ms.length; i++) {
			// 这里i是<数组的长度
			if (ms[i] == null) {
				index = i;
				break;
			}
			// ms[index] = m;错了存入对象不在循环以内
		}
		// 循环结束后，将新增电影的对象存入index的位置
		ms[index] = m;
		backMainMenu();

	}

	public void delete() {
		System.out.println("请输入所要删除电影的名字");
		String movieName = input.next();
		// [1][1][1][1][0][0][0]
		int index = -1;
		for (int i = 0; i < ms.length; i++) {
			Movie m = ms[i];
			// 重点来了,注意表述
			if (m.movieName.equals(movieName)) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("您所要删除的电影不存在");
		} else {
			ms[index] = null;
			for (int j = index; j < ms.length - 1; j++) {
				// [1][1][1][1][0][0][0]
				// ms[j+1]=ms[j];错误
				ms[j] = ms[j + 1];
			}
			ms[ms.length - 1] = null;// 防止开始电影的数组是满的，那样最后一个没法给覆盖。。

		}

	}

	public void select() {
		System.out.println("电影名\t\t  导演\t\t  主演\t\t  时长");
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
 * test.add("第" + i + "个元素"); } System.out.println(test.get(0));
 * 
 * // for (Object j : test) { // System.out.println(j); // // } // for (int i =
 * 0; i < test.size(); i++) { // System.out.println(test.get(i)); // }
 * 
 * Map map = new HashMap(); map.put("名字", "小明"); map.put("年龄", 123); map.put(3,
 * new ArrayList());
 * 
 * map.remove(3);
 * 
 * System.out.println(map);
 * 
 * }
 */
