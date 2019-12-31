package mychain;

import personchain.PersonChainNode;

public class LinkedList {
	private Node head;// ͷ�ڵ�
	private Node tial;// β���
	private int size;// ����

	public Node getHead() {
		return this.head;

	}

	// ��ӽڵ㣬������ݵ�ĩλ
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

	// �Ƴ�ָ��λ�õ�����
	public void remove(int i) {

		Node inode = this.get(i);
		inode.next = null;
		inode.prev = null;
		Node node1 = this.get(i - 1);
		Node node2 = this.get(i + 1);
		node1.next = node2;

	}

	// ��ȡָ��λ�õ�����
	public Node get(int i) {
		int count = 0;
		Node p;

		for (p = head; p != null; p = p.next) {
			count++;
			if (count == i+1) {
				// System.out.println(p);
				return p;// return����Ĵ��벻��ִ��
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