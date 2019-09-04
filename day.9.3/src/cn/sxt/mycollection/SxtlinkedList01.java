package cn.sxt.mycollection;

public class SxtlinkedList01 {
	/*
	 * 自定义一个链表
	 */
	private Node first;
	private Node last;

	private int size;

	public void add(Object obj) {
		Node node = new Node(obj);

		if (first == null) {
			// node.previous = null;
			// node.next = null;
			first = node;
			last = node;
		}else{
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public String toString(){
		//[a,b,c]  first = a, last = c
		//a,b,c
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while (temp != null){
			sb.append(temp.element+ ",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length() - 1,']');
		return sb.toString();
	}
		public static void main(String[] args){
			SxtlinkedList01 list = new SxtlinkedList01();
			list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("e");
			list.add("f");
			System.out.println(list);
		}
		
	}

