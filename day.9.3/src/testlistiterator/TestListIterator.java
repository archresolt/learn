package testlistiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
public static void main(String[] args){
	ArrayList list = new ArrayList();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	
	ListIterator it = list.listIterator();
	while(it.hasNext()){
		System.out.println(it.nextIndex());
		it.set("*");
	}
	while (it.hasPrevious()){
		System.out.println(it.previous());
	}
}
}
