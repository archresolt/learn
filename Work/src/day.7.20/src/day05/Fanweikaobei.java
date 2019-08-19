package day05;

import java.util.Arrays;

public class Fanweikaobei {
	public static void main(String[] args) {
		int [] arr01 = new int[] {1,1,4,5,3,2,9,7,8,78};
		int [] arr03 = Arrays.copyOfRange (arr01,2,5);
		for (int i:arr03) {
			System.out.println(i);
		}
	}



}
