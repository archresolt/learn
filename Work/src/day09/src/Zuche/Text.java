package Zuche;

public class Text {
	public static void main(String[] args) {
		
	
		
		
	Auto [] autos = { new Car("��A8888","����","550i"),new Car("��A6666","���","�����"),
			new Bus("��A9999","��",20),new Truck("��9988","������һ���",30)
	};
	
	
	for (Auto i:autos){
		System.out.println(i);
		
	}
	//�������ӡ��ô��
	
	
	Person p = new Person("С��");
	p.count(autos,3);

}
}