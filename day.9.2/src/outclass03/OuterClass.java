package outclass03;

public class OuterClass {
//�ⲿ��ķ���
	public void test(){
		
	
	//�����е��ڲ���
	//public InnerClass{
		class InnerClass{
		//�ڲ���ķ���
		public void test02(){
			System.out.println("�ڲ���ķ���");
		}
	}
	new InnerClass().test02();
	}
}
