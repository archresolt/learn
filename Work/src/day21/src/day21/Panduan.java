package day21;

import java.util.HashMap;

public class Panduan {
public static void main(String[] args) {
	HashMap<String ,Integer>map = new HashMap<>();
	//boolean
	//ÅĞ¶ÏmapÊÇ·ñÎª¿Õ
	System.out.println(map.isEmpty());//ture
	map.put("DEMO", 1);
	System.out.println(map.isEmpty());//false
}
}
