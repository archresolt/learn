package outclass01;

public class OuterClass {
	// �ⲿ��ĳ�Ա����
	private int age = 10;
	private static int a = 30;

	// ��һ���ڲ��ඨ�����ⲿ�����棬���������
	// �͵õ�һ����Ա�ڲ���
	class InnerClass {
		// �ڲ���ĳ�Ա����
		private int age = 20;

		// �ڲ���ķ���
		public void test() {
			// �ڲ������ֱ��ʹ���ⲿ��ĳ�Ա����
			/*
			 * �ڲ���ĳ�Ա�������ⲿ��ĳ�Ա�������������� �����ڲ�����ʹ�õ�ʱ������ʹ�õ��ڲ���ĳ�Ա����
			 * ���ڲ�������Ҫʹ���ⲿ���Ա��ʱ�� �ⲿ����.this.
			 */
			System.out.println("�ڲ���ķ���" + OuterClass.this.age);
			// �ڲ��˿���ֱ��ʹ���ⲿ��ĳ�Ա����
			test02();

		}
	}

	// �ⲿ��ķ���
	public void test02() {
		System.out.println("�ⲿ��ķ���");
	}
}
