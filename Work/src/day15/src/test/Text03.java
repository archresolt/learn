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

		// д
		FileWriter fw = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fw);

		// ����һ��String װ�ļ�
		String str = "�������ˡ� �������º�ʱ�ˣ� ����֪���١�С¥��ҹ�ֶ��磬�ʹ��������������С���������Ӧ���ڣ�ֻ�����ոġ�";

		br.write(str);
		br.newLine();
		br.close();
		br.close();
	}
}