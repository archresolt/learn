package day02;
//用while和for循环分别计算100以内奇数和偶数的和，并输出
public class jiou {
	public static void main (String[] args) {
		int i = 1;
		int jsum = 0;
		int osum = 0;
		while (i <= 100) {
			if (i % 2 ==0)  {
				osum += i;//等同于osum=osum+i
				
			}else{
				jsum += i;
			}
			i++;
		}
		System.out.println("奇数的和是"+jsum);
		System.out.println("偶数的和是"+osum);
	}

}
