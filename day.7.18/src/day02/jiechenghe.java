package day02;
//编程求：1！+2！+……+10!;

public class jiechenghe {
	public static void main (String[] args){
		int sum =0; 
		for (int i = 1;i <= 10; i++){
			System.out.println("对"+i+"求阶乘");
			int jc = 1;
			for (int j = 1; j<=i; j++){
				jc*= i;
			}
			sum += jc;
		}
			System.out.println(sum);
		}

}
