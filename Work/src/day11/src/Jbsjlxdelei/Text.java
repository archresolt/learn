package Jbsjlxdelei;

public class Text {
	public static void main(String[] args) {
	
		
		
		

		int i = 10;
		Integer it = new Integer(i);// Text���Integer����ô��
		Integer it02 = Integer.valueOf("12");
		// ����װ��Ķ���ת��Ϊ������������
		int i2 = it.intValue();

		// �����������͵ı�������ֱ��ת��Ϊ��װ��Ķ���
		Integer it03 = /* int */10;// ��ͬ��Integer it = new Integer(10);

		//�����������Ϳ���ֱ��ת���ɻ����������͵ı���
		int i3 = it;//��ͬ��int i2 = it.intValue();
	}

}
