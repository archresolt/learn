package ComparatorTest;

import java.util.Comparator;

public class StudentComparator implements Comparator{

	//��ѧ���ɼ�����
	@Override
	public int compare(Object o1, Object o2) {
		Student s1= (Student)o1;
		Student s2= (Student)o2;
		
		// TODO �Զ����ɵķ������
		return s1.score - s2.score;
	}
	

}
