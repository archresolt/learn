package day04;

import java.lang.reflect.Array;

public class Shuzucharu {
    public static void main(String[] args) {
    	int[] arr01 = new int[]{12,34,40,65,89};
    	//����һ���µ����飬���ȱ�ԭ���鳤�ȼ�һ
    	int[] arr02 = new int[arr01.length + 1];
    	//������������Ϊ{12,34,40,65,89,0}
    	for (int i = 0; i < arr01.length; i++ ){
    		arr02[i] = arr01[i];
    		
    	}
    	
	int index = 0;
	for (int i = 0; i < arr02.length; i++){
		int n = arr02[i];
		if (n > 56) {
			 index = i;
			 break;
			
			
		}
	}
	for (int i = arr02.length - 1; i> index; i--){
		arr02[i] = arr02[i-1];
	}
	arr02[index] = 56;
	for (int i :arr02) {
		System.out.println(i);
		
	}
	
	
}
}
