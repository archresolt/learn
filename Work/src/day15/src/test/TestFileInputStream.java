package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String[] args) throws IOException {
		//创建一个操作文件的字节数如流的对象
		FileInputStream fis = new FileInputStream("D:/3/3.text");
		int n = 0;
		//一边读取下一个字节 一边赋值 一边判断，如果读到的值是-1 则证明已经读取到文件末尾了 循环结束
		while ((n=fis.read())!=-1){
			System.out.println((char)n);
			
		}
		//将字节输入流中所有的字节都堵到一个字节数组中
		byte [] bs = new byte [1024];
		int count = fis.read(bs);
		System.out.println(new String (bs,0,count));
		
		fis.close();
	}

}
