package day04;

import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {
		int [] array = new int[] {1,1,4,5,3,2,9,7,8,78};
		int[] arr01 = Arrays.copyOf (array, 14 );
		for(int i : arr01) {
			System.out.println(i);
		}
		
	}

}
