package day21;

import java.util.HashMap;

public class Suoyouzhi {
public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	HashMap<String,Integer> map1 = new HashMap<>();
	map.put("我的", 21);
	map.put("她的", 23);
	map1.put("他的", 16);
	map1.put("我们的总和", 60);
	System.out.println(map);//{我的=21,她的=23}
    map.putAll(map1);
    System.out.println(map);//你知道的
    
}
}
