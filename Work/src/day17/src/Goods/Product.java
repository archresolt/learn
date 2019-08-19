package Goods;

public class Product extends Thread {
	private Goods goods;

	public Product(Goods goods) {
		super();
		this.goods = goods;
	}

	public void run(){
		 for (int i = 0;i<10;i++){
			 if (i % 2 == 0){
			 goods.prd("Íú×Ð","Ð¡ÂøÍ·");
			 
			
		 }else{
			 goods.prd("ÍÛ¹þ¹þ","¿óÈªË®");
				 
				 
			 }
		 }
}
}