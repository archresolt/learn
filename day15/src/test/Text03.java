package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.BranchElement;

public class Text03 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\1.text");
		if (file.exists()) {
			file.delete();
			file.createNewFile();

		} else {
			file.createNewFile();
		}

		// 写
		FileWriter fw = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fw);

		// 定义一个String 装文集
		String str = "《虞美人》 春花秋月何时了？ 往事知多少。小楼昨夜又东风，故国不堪回首月明中。雕栏玉砌应犹在，只是朱颜改。";

		br.write(str);
		br.newLine();
		br.close();
		br.close();
	}
}