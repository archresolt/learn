package day21;

import java.util.HashMap;

public class Quzhi {
public static void main(String[] args) {
	HashMap<String ,Integer> map = new HashMap<>();
	map.put("DEMO", 1);
	//Value������
	//�õ�map��key���Ӧ��value��ֵ
	System.out.println(map.get("1"));//null
	System.out.println(map.get("DEMO"));//1
		
	}
}

