package day08;

public class car {
	private String paizi;
	private String xinghao;
	private String yanse;
	private int maxspeed;
	public void music(){
		System.out.println("听音乐");
	}
	public car() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public car(String paizi, String xinghao, String yanse, int maxspeed) {
		super();
		this.paizi = paizi;
		this.xinghao = xinghao;
		this.yanse = yanse;
		this.maxspeed = maxspeed;
	}
	public String getPaizi() {
		return paizi;
	}
	public void setPaizi(String paizi) {
		this.paizi = paizi;
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	public String getYanse() {
		return yanse;
	}
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
    
	
}
