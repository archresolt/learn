package Zuche;

public class Text {
	public static void main(String[] args) {
		
	
		
		
	Auto [] autos = { new Car("粤A8888","宝马","550i"),new Car("粤A6666","别克","商务舱"),
			new Bus("粤A9999","金杯",20),new Truck("粤9988","东给你挂机啦",30)
	};
	
	
	for (Auto i:autos){
		System.out.println(i);
		
	}
	//这里想打印怎么办
	
	
	Person p = new Person("小明");
	p.count(autos,3);

}
}