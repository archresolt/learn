package day02;
//��while��forѭ���ֱ����100����������ż���ĺͣ������
public class jioufor {
	public static void main (String[] args){
		int jsum = 0;
		int osum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 ==0){
				osum += i;
			}
			else{
				jsum += i;
				
			}
		}
		System.out.println ("�����ĺ���"+jsum);
		System.out.println ("ż���ĺ���"+osum);
	}

}
