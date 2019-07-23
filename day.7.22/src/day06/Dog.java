package day06;

/*public class Dog {
	String name ;
	String type ;
	int health;
	String zibai;
	public void sname() {
		System.out.println("请输入要领养宠物的名字："+name);
	}
	public void stype() {
		System.out.println("请选择狗狗的品种："+ type);
	}
	public void shealth() {
		if (health<1){
			System.out.println("请输入狗狗的健康值:"+ 60);}
			else if (health<=100){
				System.out.println("请输入狗狗的健康值:"+ "health");	
			}else {
				System.out.println("请输入狗狗的健康值:"+ 60);
			}
		}
	public void  szibai (){
		System.out.println("我的名字叫:"+ name +"健康值是:" + health + "我是一只"+"聪明的拉布拉多犬");}
		
	}*/
  

public class Dog{
	String name ;
	String brand ;
	int health;
	int love;
	
	public void print(){
		System.out.println("我的名字是："+name+"健康值是："+health+"和主人的亲密度是："+love);
	}
}
