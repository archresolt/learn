package test;

public class Geshibaiqian {
	// 输入一个四位整数，要求变成将这个四位数中的个位·十位·百位·千位分别输出
	public static void main(String[] args) {
		int i = 1345;
		int[] arr01 = { 0, 0, 0, 0 };
		arr01[0] = i / 1000;
		arr01[1] = (i - arr01[0] * 1000) / 100;
		arr01[2] = (i - arr01[0] * 1000 - arr01[1] * 100) / 10;
		arr01[3] = (i - arr01[0] * 1000 - arr01[1] * 100 - arr01[2] * 10) / 1;
		// for (int j : arr01) {
		// System.out.println(j);
		// }
		// 实现倒序输出数组
		for (int k = arr01.length - 1; k >= 0; k--) {
			System.out.println(arr01[k]);
		}

	}
}
