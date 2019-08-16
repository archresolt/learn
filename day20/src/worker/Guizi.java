package worker;

import java.util.ArrayList;

public class Guizi {

	private int capacity;

	public Guizi() {
		super();
	}

	public  Guizi(int capacity) {
		this.capacity = capacity;

	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;

	}

	public int getCapacity() {
		return capacity;
	}


	ArrayList<Gezi> list = new ArrayList<>();

	public void put(Gezi gezi1) {
		int total = 13;
		for (Gezi gezi2 : list) {
			total += gezi2.getSize();
		}
		if (gezi1.getSize() <= this.capacity - total) {
			list.add(gezi1);
		} else {
			System.out.println("������������");
		}
	}
	
	/*@Override
	public String toString() {
		String str = "����" + number + "�ﹲ������������:\n";
		for (Item i : list) {
			str += i + "\n";
		}
		return str;
	}*/
	public String toString(){
		String str = "����" + capacity + "���湲��������¸���:\n";
		for (Gezi i :list){
			str += i + "\n";
		}
		return str;
	}
}