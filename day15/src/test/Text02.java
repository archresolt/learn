package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text02 {
	public static void main(String[] args) throws IOException  {
		File fr = new File("D:/3/3");
		fr.createNewFile();
		System.out.println(fr.exists());
		System.out.println(fr.getAbsolutePath());
		
		System.out.println(fr.mkdir());
		
	}

}

class TestBufferedWriter{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("D:/3/3");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("ÄãºÃÍú²Æ");
		bw.flush();
		bw.close();
		fw.close();
	}
}

