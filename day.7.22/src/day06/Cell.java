package day06;

public class Cell {
	public void charge () {
		for (int i = 1;i<=10;i++){
			System.out.println("充电已经完成"+i+"0%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
}
