package day02;
//��while��forѭ�����1-1000֮���ܱ�5������������ÿ�����3����
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
