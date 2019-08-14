package Xiancheng;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		TheadDemo1 Demo = new TheadDemo1();
	
		
		for (int i = 0 ; i < 20;i++){
			
		System.out.println("Ö÷Ïß³Ì"+i);
		
		
		Demo.run();
		
		}
	}

}
