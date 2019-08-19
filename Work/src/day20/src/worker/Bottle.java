package worker;

public class Bottle extends Item {

	private String skin;

	public Bottle(String skin) {
		super("瓶子");
		this.skin = skin;
	}

	@Override
	public String toString() {
		return "物件名：" + this.getName() + " 材质:" + skin;
	}
}
