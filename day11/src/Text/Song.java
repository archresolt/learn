package Text;

import java.util.Scanner;

public class Song {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("«Î ‰»Î∏Ë¥ ");
		String string = input.nextLine();
		String [] strs = string.split(" ");
		for (String str01:strs){
		System.out.println(str01);
	}

}
}