package Goods;

public class Test {
	public static void main(String[] args) {
		Goods gs = new Goods();
		Product pr = new Product(gs);
		Ctom ct = new Ctom(gs);
		
		pr.start();
		ct.start();
	}

}
