package Zuche;

public class Person {
	private String name;

	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Person(String name) {
		super();
		this.name = name;
	}
//比较难理解
	public void count(Auto[]autos,int day){
		int count =0;
		for (Auto auto : autos){
			int money = auto.moneyCount(day);
			count += money;
			
		}
		System.out.println("总租金为:"+count);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
