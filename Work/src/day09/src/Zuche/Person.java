package Zuche;

public class Person {
	private String name;

	public Person() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Person(String name) {
		super();
		this.name = name;
	}
//�Ƚ������
	public void count(Auto[]autos,int day){
		int count =0;
		for (Auto auto : autos){
			int money = auto.moneyCount(day);
			count += money;
			
		}
		System.out.println("�����Ϊ:"+count);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
