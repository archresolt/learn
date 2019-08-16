package worker;

public class Yaopin extends Item {

	public Yaopin(String name) {
		super("药品");
		// TODO 自动生成的构造函数存根
	}

	private String name;
	private float price;
	private String place;

	public Yaopin(String name, float price, String place) {
		super("药品");
		this.name = name;
		this.price = price;
		this.place = place;
	}
    public void setName(){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    public void setPrice(){
    	this.price = price;
    }
    public float getPrice(){
    	return price;
    }
    public void setplace(){
    	this.place = place;
    }
    public String getplace(){
    	return place;
    }

    
   /* @Override
	public String toString() {
		return "Yaopin [name=" + name + ", price=" + price + ", place=" + place
				+ "]";
	}*/
    public String toString(){
    	return "Yaopin [name = "+ name + ", price="+ price +", place = "+ place +"]";
    }
}
