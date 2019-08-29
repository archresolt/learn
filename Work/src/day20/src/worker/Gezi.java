package worker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Gezi {
	private int number;
	private int size;

	public Gezi() {
		super();
	}

	public Gezi(int number, int size) {
		this.number = number;
		this.size = size;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	// item arr01[] = new item [4];
	// ����һ��������װ���ڸ��������Ʒ
	ArrayList<Item> list = new ArrayList<Item>();

	public void put(Item it1) {
		// ��װ���ӵ��ڲ�ʵ��
		// for(Ԫ������t Ԫ�ر���x : ��������obj)
		int total = 0;
		for (Item it2 : list) {
			total += it2.getSize();
		}
		if (it1.getSize() <= this.size - total) {
			list.add(it1);
		} else {
			System.out.println("�Ų�����");
		}
	}

	@Override
	public String toString() {
		String str = "����" + number + "�ﹲ������������:\n";
		for (Item i : list) {
			str += i + "\n";
		}
		return str;
	}

}