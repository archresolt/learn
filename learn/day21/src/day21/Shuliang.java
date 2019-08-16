package day21;

import java.util.HashMap;

public class Shuliang {
public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	//显示map里值得数量
	System.out.println(map.size());
	map.put("DEMO1",1);
	System.out.println(map.size());
	map.put("DEMO",2);
	System.out.println(map.size());
}            
}
