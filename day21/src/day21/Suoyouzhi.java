package day21;

import java.util.HashMap;

public class Suoyouzhi {
public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	HashMap<String,Integer> map1 = new HashMap<>();
	map.put("�ҵ�", 21);
	map.put("����", 23);
	map1.put("����", 16);
	map1.put("���ǵ��ܺ�", 60);
	System.out.println(map);//{�ҵ�=21,����=23}
    map.putAll(map1);
    System.out.println(map);//��֪����
    
}
}
