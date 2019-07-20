package day03;

public class Tigui {
	public static void main (String[] args) {
		int n = jc(5);
		System.out.println(n);
	}
	public static int jc (int n) {
		int jc = 1;
		if (n == 1){
			return  1;
			
		}else{
			return n*jc(n-1);
			
		}
		
		
	}
}


