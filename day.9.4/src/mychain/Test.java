package mychain;

public class Test {
	public static void main(String[] args) {

		LinkedList n = new LinkedList();
		n.add("�й�");

		n.add("����");
		n.get(1);

		n.add("����");
		n.add("�¹�");
		// n.remove(3);
		// System.out.println(n);
		System.out.println(n.get(0));
		System.out.println(n.get(1));
		System.out.println(n.get(2));
		System.out.println(n.get(3));
		System.out.println(n.get(4));
		System.out.println(n.get(5));
	}
}