package innerclass04;

public class Test {
/*
 * �����ڲ���
 * ֱ��ͨ���ӿڻ��߳�������new����
 * �ӿںͳ����಻��ֱ�Ӵ������������ڴ�������֮ǰ���Ƚ��ӿڻ��߳����࣬ʵ�ֳ�һ���ڲ���
 * ���ڲ���û�����֣����Գ�֮Ϊ�����ڲ���
 * 
 * ʹ�ó���
 * ��һ���ӿڵ�ʵ���ֻ࣬��Ҫʹ��һ�Σ����ʱ����Խ��ӿ�ʵ�ֳ�һ�������ڲ���
 * 
 */
	
		public static void main (String[] args){
			MyInterface mi = new MyInterface() {

				@Override
				public void test() {
					// TODO �Զ����ɵķ������
					System.out.println("�����ڲ���ķ���");
				}
				
			
		};
		mi.test();
	}
}
