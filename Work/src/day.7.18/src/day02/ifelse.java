package day02;

public class ifelse {
	public static void main (String[] args) {
	
		int money = (int)(100*Math.random());
		System.out.print("��һ������"+ money +"Ԫ");
		if (money<=100){
		    System.out.println("��8�ۣ��ۺ�"+ money*0.8+"Ԫ");
			
		}else if (money<=200){
			System.out.println("��7.5�ۣ��ۺ�"+money*0.75+"Ԫ");
			
		}else {
			System.out.println("��7�ۣ��ۺ�"+money*0.7+"Ԫ");
		}
	
	}
}
