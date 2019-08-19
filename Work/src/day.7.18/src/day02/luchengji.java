package day02;

import java.util.Scanner;

//循环录入某学生5门课的成绩并且计算平均分,如果分数录入为负数,重新录入
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
			System.out.println("请输入第"+i+"门功课的成绩");
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