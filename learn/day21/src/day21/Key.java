package day21;

import java.util.HashMap;

public class Key {
public static void main(String[] args) {
	HashMap<String ,Integer> map = new HashMap<>();
	//�ж�map���Ƿ�������key
	System.out.println(map.containsKey("DEMO"));
	map.put("DEMO", 1);
	System.out.println(map.containsKey("DEMO"));//ture
}
}
