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
	// TODO �Զ����ɵķ������
	}
}
 public synchronized void sale(){
	 if(money>0){
	 System.out.println(Thread.currentThread().getName()+"׼��ȡ��");
	 System.out.println(Thread.currentThread().getName()+"ȡ�����");
	 money-= 100;
	 try {Thread.sleep(500);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
 }else{
	 for(int i =0 ;i<5;i++){
		 System.out.println("������֧��"+Thread.currentThread().getName()+"��ȡ��");
	 }
		 
	 }
 }
}

