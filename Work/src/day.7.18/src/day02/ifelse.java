package day02;

public class ifelse {
	public static void main (String[] args) {
	
		int money = (int)(100*Math.random());
		System.out.print("您一共消费"+ money +"元");
		if (money<=100){
		    System.out.println("打8折，折后"+ money*0.8+"元");
			
		}else if (money<=200){
			System.out.println("打7.5折，折后"+money*0.75+"元");
			
		}else {
			System.out.println("打7折，折后"+money*0.7+"元");
		}
	
	}
}
