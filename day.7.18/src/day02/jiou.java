package day02;
//��while��forѭ���ֱ����100����������ż���ĺͣ������
public class jiou {
	public static void main (String[] args) {
		int i = 1;
		int jsum = 0;
		int osum = 0;
		while (i <= 100) {
			if (i % 2 ==0)  {
				osum += i;//��ͬ��osum=osum+i
				
			}else{
				jsum += i;
			}
			i++;
		}
		System.out.println("�����ĺ���"+jsum);
		System.out.println("ż���ĺ���"+osum);
	}

}
