package outclass01;

public class OuterClass {
	// 外部类的成员变量
	private int age = 10;
	private static int a = 30;

	// 将一个内部类定义在外部类里面，方法的外边
	// 就得到一个成员内部类
	class InnerClass {
		// 内部类的成员变量
		private int age = 20;

		// 内部类的方法
		public void test() {
			// 内部类可以直接使用外部类的成员变量
			/*
			 * 内部类的成员变量和外部类的成员变量可以重命名 当在内部类中使用的时候，优先使用到内部类的成员变量
			 * 党内部类中想要使用外部类成员的时候 外部类名.this.
			 */
			System.out.println("内部类的方法" + OuterClass.this.age);
			// 内部了可以直接使用外部类的成员方法
			test02();

		}
	}

	// 外部类的方法
	public void test02() {
		System.out.println("外部类的方法");
	}
}
