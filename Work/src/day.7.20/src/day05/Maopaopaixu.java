package day05;

import javax.naming.InitialContext;

public class Maopaopaixu {
	public static void main(String[] args) {
		//长度为十六的数组，冒出16-1=15次的最值
		int [] arr01 = {12,45,98,90,87,67,36,98,26,67,34,98,23,76,45,73,};
		for (int i = 0; i < arr01.length-1; i++){
			
			for (int j = 0; j < arr01.length-1-i; j++){
				int n1 = arr01 [j];
				int n2 = arr01 [j+1];
				if (n1 > n2){
					arr01 [j] = n2;
					arr01 [j+1] = n1;
				}
			}
			
				
			}
			
		for (int h :arr01){
			System.out.println( h );		
		}
		
	}

}
