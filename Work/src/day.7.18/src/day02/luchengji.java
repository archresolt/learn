package day02;

import java.util.Scanner;

//ѭ��¼��ĳѧ��5�ſεĳɼ����Ҽ���ƽ����,�������¼��Ϊ����,����¼��
/*public class luchengji {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		int sum =0;
		for (int i = 1;i < 6; i++){
		int score = input.nextInt();
		if (score < 0){
			i--;
		
		}else{
			sum += score;
		}
			
	}
		System.out.println (sum/5);

}
}*/

public class luchengji {
	public static void main (String[] args){
		Scanner input =new Scanner (System.in);
		int sum = 0;
		for(int i = 1; i < 6; i++){
			System.out.println("�������"+i+"�Ź��εĳɼ�");
			int score = input.nextInt();
			if (score < 0) {
				i--;
			
			}else{
				sum += score;
			}
		}
		System.out.println (sum/5);
		
	}
}