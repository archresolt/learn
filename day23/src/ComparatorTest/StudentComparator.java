package ComparatorTest;

import java.util.Comparator;

public class StudentComparator implements Comparator{

	//按学生成绩升序
	@Override
	public int compare(Object o1, Object o2) {
		Student s1= (Student)o1;
		Student s2= (Student)o2;
		
		// TODO 自动生成的方法存根
		return s1.score - s2.score;
	}
	

}
