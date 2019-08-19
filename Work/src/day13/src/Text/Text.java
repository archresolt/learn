package Text;

import java.util.ArrayList;
import java.util.Set;

public class Text {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Dog ("wangcai",80));
		list.add(new Dog("wangcai2",90));
		list.add(new Dog ("wangcai3",100));
		
		System.out.println(list.size());
		System.out.println(list);
		list.remove(1);
		list.set(0,new Dog("xiaobai",70));
		System.out.println(list.contains(new Dog ("xiaobai",70)));
		System.out.println(list);
	}

}
