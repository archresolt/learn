package Dalisheji;



public class UserInfo {
	
	private String userName;
	private String psw;
	
	static UserInfo info =null;
	public static UserInfo getUserInfo(){
		if (info ==null){
			
		info = new UserInfo();
		}
		return info;
	}
	//上面这两句是什么意思呀  怎么调用
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public static UserInfo getInfo() {
		return info;
	}
	public static void setInfo(UserInfo info) {
		UserInfo.info = info;
	}
	
	//UserInfo info = UserInfo.getUserInfo();
	//info.setPsw(psw);
	//info.setUserName(userName);
	//setPsw是在哪里调用的方法？下面这两句可以在这里调用吗
	
	

}
