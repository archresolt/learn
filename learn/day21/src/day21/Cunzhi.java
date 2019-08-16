package day21;

import java.util.HashMap;

public class Cunzhi {
	public static void main(String[] args) {
		//向map中添加值（返回这个key以前的值，如果没有返回null）
		HashMap<String,Integer>map = new HashMap<>();
		System.out.println(map.put("1", 1));
		System.out.println(map.put("1", 2));
		
	}

}
