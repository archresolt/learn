package xiawu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.Scanner;

public class Test2 {
	

	public static void main(String[] args) throws IOException {
		/*File file = new File("D:\\test\\abc.txt");
		try {
			boolean value = file.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();*/
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string  = null;
		
		//创建一个打印流  将用户录入的数据写入文件
			PrintStream ps = new PrintStream(new File("D:\\test\\abc.txt"));
			while (!"-1".equals((string = br.readLine()))){
				ps.println(string);
				ps.flush();
				
		
		
	}
			ps.close();
			br.close();


		
	}

}
