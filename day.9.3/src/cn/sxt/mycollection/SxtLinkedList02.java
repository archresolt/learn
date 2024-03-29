package cn.sxt.mycollection;

/*
 * 自定义一个链表
 * 增加get方法
 * 
 */
public class SxtLinkedList02 {
	private Node first;
	private Node last;
	private int size;

	// []
	// ["a","b","c","d","e","f"]
	public Object get(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("索引数字不合法" + index);

		}
		Node temp = null;
		if (index <= (size >> 1)) {
			// size>>1相当于除以二
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = last;
			for (int i = size - 1; i > index; i--) {
				temp = temp.previous;
			}
		}
		return temp.element;
	}
}
