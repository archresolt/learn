package test;

public class Geshibaiqian {
	// ����һ����λ������Ҫ���ɽ������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ����
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
		// ʵ�ֵ����������
		for (int k = arr01.length - 1; k >= 0; k--) {
			System.out.println(arr01[k]);
		}

	}
}