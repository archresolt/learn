package day26;
import java.util.Scanner;
public class JavaDay003 {

public static void main(String[] args){
	System.out.println("��������������");
	Scanner scanner = new Scanner(System.in);
	int nNumA = scanner.nextInt();
	int nNumB = scanner.nextInt();
	int nNumC = scanner.nextInt();
	
	int nMax = 0;
	if(nNumA >= nNumB && nNumA >= nNumC){
		nMax = nNumA;
	}
	else if (nNumB >= nNumC && nNumB >= nNumA){
		nMax = nNumB;
	}
	else if(nNumC >= nNumB && nNumC >= nNumA){
		nMax = nNumC;
	}
	else
	{
		System.out.println("�޷��Ƚϣ�");
	}
	System.out.println("Max =" + nMax);
	
}
}
