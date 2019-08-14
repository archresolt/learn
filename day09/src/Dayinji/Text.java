package Dayinji;

public class Text {
	public static void main(String[] args) {
		Dayinji p = new Dayinji();
		A4Paper a4Paper = new A4Paper();
		Colormohe colormohe = new Colormohe();
		p.setPaper(a4Paper);
		p.setMohe(colormohe);
		p.print();
		
	}

}
