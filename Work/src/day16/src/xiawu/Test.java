package xiawu;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) throws IOException {
	
		File file = new File("D:\\test\\Test.txt");
		file.createNewFile();
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
	}

}
