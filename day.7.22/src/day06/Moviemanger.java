package day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Moviemanger {
	public void add() {

	}

	public void delete() {

	}

	public void find() {

	}

	ArrayList i = new ArrayList();

	public static void main(String[] args123123) {
		String[] x = new String[4];
		ArrayList test = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			test.add("第" + i + "个元素");
		}
		System.out.println(test.get(0));

//		for (Object j : test) {
//			System.out.println(j);
//
//		}
//		for (int i = 0; i < test.size(); i++) {
//			System.out.println(test.get(i));
//		}

		Map map = new HashMap();
		map.put("名字", "小明");
		map.put("年龄", 123);
		map.put(3, new ArrayList());

		map.remove(3);
		
		System.out.println(map);
		
	}
}