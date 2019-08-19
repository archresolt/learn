package day23;

import java.util.HashSet;
import java.util.Iterator;

public class ForTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String value = (String) iter.next();
			System.out.println(value);
		}

	}

}
