package outclass02;

public class OuterClass {
//�ⲿ�����ͨ��Ա����
	private int age = 10 ;
	//�ⲿ��ľ�̬��Ա����
	static int a  = 30;
	
	//�ⲿ��ĳ�Ա����
	public void test(){
		System.out.println("�ⲿ��ĳ�Ա����");
		
	}
	
	
	
	//��̬�ڲ���
	static class InnerClass{
		//��̬�ڲ���ĳ�Ա����
		private static int age02 = 20;
		//��̬�ڲ���ĳ�Ա����
		public void test02(){
			System.out.println("��̬�ڲ���ĳ�Ա����" + a);
		}
	}
	
}
