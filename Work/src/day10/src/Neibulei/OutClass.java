package Neibulei;

public class OutClass {
	private int age = 20;

	class InnerClass {
		private int age1 = 12;

		public void test() {
			System.out.println("����������" + OutClass.this.age);
			test02();
		}
		
	}

	public void test02() {
		System.out.println("����Ĳ���������");
	}

}
