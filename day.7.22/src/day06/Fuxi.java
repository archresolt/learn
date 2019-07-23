package day06;

public class Fuxi {
	public static void main (String[] args){
		int [] arr01 ={1,2,3,2,3,6,7,5,4};
		for (int i = 0;i < arr01.length-1; i++){
			for (int j = 0; j < arr01.length-1-i;j++) {
			    int n1 = arr01[j];
				int n2 = arr01[j+1];
				if ( n1 > n2){
					arr01[j] = n2;
					arr01[j+1] = n1;
					
				}		
						
			}
		}
		
			for (int h :arr01){
				System.out.println( h );
				
	}
	}
}
