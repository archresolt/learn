package Neibulei;

public class OutClass {
	private int age = 20;

	class InnerClass {
		private int age1 = 12;

		public void test() {
			System.out.println("老妈在做饭" + OutClass.this.age);
			test02();
		}
		
	}

	public void test02() {
		System.out.println("我真的不清楚这回事");
	}

}
