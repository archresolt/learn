package day21;

import java.util.HashMap;

public class Shanchu {
public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<>();
	System.out.println(map.remove(1));//null
	map.put( 2,"DEMO");
	System.out.println(map.remove(2));
	
}
}
/*public class Shanchu{
	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<>();
		System.out.println(map.remove(1));//null
		map.out(2,"DEMO");
		System.out.println(map.remove(2));
		}
		
		
	}*/