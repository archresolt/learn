package worker;

public class Test1 {
	public static void main(String[] args) {
		Wawa a = new Wawa();
		Item b = new Bottle("����");
		Item c = new Bottle("�X");
		a.setSize(100);
		b.setSize(100);
		c.setSize(100);
		Guizi e = new Guizi(800);
		Gezi d = new Gezi(1, 300);
		Gezi f = new Gezi(2, 300);
		e.put(d);
		e.put(f);
		d.put(a);
		d.put(b);
		d.put(c);
		f.put(b);
		f.put(c);
		System.out.println(e);
	}

}
