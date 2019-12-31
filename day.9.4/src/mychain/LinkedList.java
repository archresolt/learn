package mychain;

import personchain.PersonChainNode;

public class LinkedList {
	private Node head;// 头节点
	private Node tial;// 尾结点
	private int size;// 长度

	public Node getHead() {
		return this.head;

	}

	// 添加节点，存放数据到末位
	public void add(Object j) {
		Node n = new Node();
		n.data = j;
		if (tial == null) {
			tial = n;
			head = n;
		} else {
			tial.next = n;
			tial = n;
		}

	}

	// 移除指定位置的数据
	public void remove(int i) {

		Node inode = this.get(i);
		inode.next = null;
		inode.prev = null;
		Node node1 = this.get(i - 1);
		Node node2 = this.get(i + 1);
		node1.next = node2;

	}

	// 获取指定位置的数据
	public Node get(int i) {
		int count = 0;
		Node p;

		for (p = head; p != null; p = p.next) {
			count++;
			if (count == i+1) {
				// System.out.println(p);
				return p;// return后面的代码不再执行
			}
		}
		return p;
	}

	public String toString(){
		StringBuffer sb=new StringBuffer();
		Node p;
		int i=0;
		while((p=get(i++))!=null){
			sb.append(p);
		}
		
		return  sb.toString();
	}
}