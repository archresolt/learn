package day02;
//用while和for循环输出1-1000之间能被5整除的数，且每行输出3个。
import javax.swing.Spring;

public class zhengchu5 {
	public static void main (String[] args) {
		for (int i = 1; i<=1000; i++) {
			if (i % 5 == 0){
				System.out.print(i+"\t");
				if (i % 15 == 0){
					System.out.println();
				}
			}
		}
	}

}
