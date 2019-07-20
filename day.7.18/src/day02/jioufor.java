package day02;
//用while和for循环分别计算100以内奇数和偶数的和，并输出
public class jioufor {
	public static void main (String[] args){
		int jsum = 0;
		int osum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 ==0){
				osum += i;
			}
			else{
				jsum += i;
				
			}
		}
		System.out.println ("奇数的和是"+jsum);
		System.out.println ("偶数的和是"+osum);
	}

}
