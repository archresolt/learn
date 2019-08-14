package Zuche;

public class Car extends Auto {
	private String type;

	public Car() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
		
	

	public Car(String id, String brand, String type) {
		super(id, brand);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	





	@Override
	public int moneyCount(int day) {
		if (type.equals("550i")){
			return 660*day;
		}else{
			return 800*day;
		}
		// TODO 自动生成的方法存根
		
	}

	
	
	
	

}
