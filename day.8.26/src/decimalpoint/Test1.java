package decimalpoint;

import java.text.DecimalFormat;

public class Test1 {
	/*
	 * public static void main(String[] args) { java.text.DecimalFormat df = new
	 * DecimalFormat(".0000"); System.out.println(df.format(6.6666666));
	 * 
	 * }
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".0000");
		System.out.println(df.format(9.2445453));
	}
}
