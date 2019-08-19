package Qukuan;

public class Account implements Runnable {
	private int money = 500;
	private int num = 0;
	
	@Override
	public void run() {
		for(int i = 0 ;i<5;i++){
			synchronized (this) {
				if (num >= 5){
					break;
				}
				if (money > 0){
					System.out.println(Thread.currentThread());
				}
				
			}
		}
		// TODO 自动生成的方法存根
		
	}

}
