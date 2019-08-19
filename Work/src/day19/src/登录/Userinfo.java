package 登录;

public class Userinfo {
	private String name ;
    private String num;
	public Userinfo() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Userinfo(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Userinfo [name=" + name + ", num=" + num + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
    

}
