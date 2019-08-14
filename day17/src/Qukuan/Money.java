package Qukuan;

public class Money implements Runnable {
	int money = 500;

	@Override
public void run() {
	while (true ){
		if(money==0){
			break;
		}
		sale();
	// TODO 自动生成的方法存根
	}
}
 public synchronized void sale(){
	 if(money>0){
	 System.out.println(Thread.currentThread().getName()+"准备取款");
	 System.out.println(Thread.currentThread().getName()+"取款完毕");
	 money-= 100;
	 try {Thread.sleep(500);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
 }else{
	 for(int i =0 ;i<5;i++){
		 System.out.println("余额不足以支付"+Thread.currentThread().getName()+"的取款");
	 }
		 
	 }
 }
}

