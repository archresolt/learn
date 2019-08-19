package ComparatorTest;

import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args){
	TreeSet set = new TreeSet(new StudentComparator());
	set.add(new Student(80));
	set.add(new Student(90));
	set.add(new Student(60));
	set.add(new Student(70));
	System.out.println(set);
}
}
