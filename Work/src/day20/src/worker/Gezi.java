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
	// 声明一个集合来装放在格子里的物品
	ArrayList<Item> list = new ArrayList<Item>();

	public void put(Item it1) {
		// 封装格子的内部实现
		// for(元素类型t 元素变量x : 遍历对象obj)
		int total = 0;
		for (Item it2 : list) {
			total += it2.getSize();
		}
		if (it1.getSize() <= this.size - total) {
			list.add(it1);
		} else {
			System.out.println("放不下了");
		}
	}

	@Override
	public String toString() {
		String str = "格子" + number + "里共存放了以下物件:\n";
		for (Item i : list) {
			str += i + "\n";
		}
		return str;
	}

}
