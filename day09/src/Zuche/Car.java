package Zuche;

public class Car extends Auto {
	private String type;

	public Car() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵķ������
		
	}

	
	
	
	

}
