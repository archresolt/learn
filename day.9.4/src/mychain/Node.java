package mychain;

import personchain.PersonChainNode;

public class Node {
	Node prev;// ��һ���ڵ�
	Node next;// ��һ���ڵ�
	Object data;// ����Ԫ��

	public Node(Node prev, Node next, Node data) {
		super();
		this.prev = prev;
		this.next = next;
		this.data = data;
	}

	public Node() {
		super();
		this.data = data;
	}

	// ��ȡ��һ���ڵ�
	public Node getNextNode() {
		// TODO �Զ����ɵķ������

		return this.next;
	}

	// ������һ���ڵ�
	public void setNextNode(Node next) {
		this.next = next;
	}

	// ��ȡ��һ���ڵ�
	public Node getPrevNode() {
		return this.prev;

	}

	// ������һ���ڵ�
	public void setPrevNode(Node prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return data == null ? "Empty Node" : data.toString();
	}
}