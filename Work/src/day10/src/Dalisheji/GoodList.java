package Dalisheji;

public class GoodList {
	public static void list (){
		UserInfo info = UserInfo.getUserInfo();
		System.out.println("商品列表界面"+info.getUserName()+info.getPsw());
	}

}
