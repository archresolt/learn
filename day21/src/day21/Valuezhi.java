package day21;

import java.util.HashMap;

public class Valuezhi {
public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	//��ʾ���е�valueֵ
	System.out.println(map.values());//[]
	map.put("demo1", 12);
	map.put("demo2", 13);
	System.out.println(map.values());//[12,13]
}
}
