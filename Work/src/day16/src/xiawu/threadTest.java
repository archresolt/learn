package xiawu;

import java.util.Scanner;

public class threadTest {

	public static boolean running = true;

	public static void main(String[] args) {
		/*
		 * myThread mt = new myThread(); mt.start(); for (int i = 0;i <
		 * 100;i++){ System.out.println("主线程"+i); }
		 */
		// for (int i = 0; i < 100; i++) {
		// System.out.println("主线程" + i);
		// }
		// myThread mt = new myThread() { //匿名内部类
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

						System.out.println("获取了输入" + running);
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
				System.out.println("主线程执行了" + (i++) + "次");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("程序结束，共执行了" + i + "次");

	}
}
