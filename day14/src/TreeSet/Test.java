package TreeSet;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(new Person("��Ī��",22));
		hashSet.add(new Person("������",20));
		hashSet.add(new Person("��һ��",24));
		System.out.println("�˵�λ����Ա������Ϊ"+ hashSet.size());
		System.out.println("Ա�����ݷֱ����£�");
	}

}
