package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String[] args) throws IOException {
		//����һ�������ļ����ֽ��������Ķ���
		FileInputStream fis = new FileInputStream("D:/3/3.text");
		int n = 0;
		//һ�߶�ȡ��һ���ֽ� һ�߸�ֵ һ���жϣ����������ֵ��-1 ��֤���Ѿ���ȡ���ļ�ĩβ�� ѭ������
		while ((n=fis.read())!=-1){
			System.out.println((char)n);
			
		}
		//���ֽ������������е��ֽڶ��µ�һ���ֽ�������
		byte [] bs = new byte [1024];
		int count = fis.read(bs);
		System.out.println(new String (bs,0,count));
		
		fis.close();
	}

}
