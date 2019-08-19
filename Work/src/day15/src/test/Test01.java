package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException{
		
		//创建一个操作文件的字节输入流的对象
		FileInputStream  fis  = new FileInputStream("D:/1.txt");
		
		int n = 0 ;
		//一边读取下一个字节  一边赋值  以便判断，
		
	}

}
