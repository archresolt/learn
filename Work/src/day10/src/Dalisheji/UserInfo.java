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
	//������������ʲô��˼ѽ  ��ô����
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
	//setPsw����������õķ�����������������������������
	
	

}
