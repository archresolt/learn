package TreeSet;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(new Person("李莫问",22));
		hashSet.add(new Person("王晓华",20));
		hashSet.add(new Person("张一曼",24));
		System.out.println("此单位共有员工人数为"+ hashSet.size());
		System.out.println("员工内容分别如下：");
	}

}
