package xiawu;

import java.util.Scanner;

public class threadTest {

	public static boolean running = true;

	public static void main(String[] args) {
		/*
		 * myThread mt = new myThread(); mt.start(); for (int i = 0;i <
		 * 100;i++){ System.out.println("���߳�"+i); }
		 */
		// for (int i = 0; i < 100; i++) {
		// System.out.println("���߳�" + i);
		// }
		// myThread mt = new myThread() { //�����ڲ���
		// public void run() {
		//
		// }
		// };
		// myThread mt2 = new myThread();
		// System.out.println(mt.getClass());
		// System.out.println(mt2.getClass());

		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (running) {
					try {
						running = scanner.nextBoolean();

						System.out.println("��ȡ������" + running);
					} finally {
					}
				}
			}
		}).start();
		String a =new String();
		a.toString();
		
		new String().toString();
		int i = 0;
		while (running) {
			try {
				System.out.println("���߳�ִ����" + (i++) + "��");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�����������ִ����" + i + "��");

	}
}
