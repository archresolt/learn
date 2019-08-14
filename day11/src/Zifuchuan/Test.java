package Zifuchuan;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//字符串的常用方法
		String str = "我是中文字符串";
		//通过下标获取字符串中的某一个字符
		System.out.println(str.charAt(0));
		//获取指定下标的字符的unicode编码值
		System.out.println(str.codePointAt(0));
		
		String str01 = new String();
		str01 = "abcdefg";
		String str02 = "Abc";
		//System.out.println(str01);
		
		//字符串比较大小
		System.out.println(str01.compareTo(str02));
		//不考虑大小写比较字符串
		System.out.println(str01.compareToIgnoreCase(str02));
		//在原字符串中追加一个新的字符串，生成一个新的字符串对象
		String str03 = str01.concat("123");
		//判断目标是否包含在当前字符串中
		System.out.println(str03.contains("123"));
		
		//创建一个新的数组，将字符串中指定范围的自负拷贝到字符数组中，从数组的某个下表开始存放
		char[] ch = new char[10];
		str01.getChars(2,4,ch,4);
		System.out.println(Arrays.toString(ch));
		
		//字符串的查找，查找第一次出现的位置的下标
		int index = str03.indexOf("b");
		System.out.println(index);
		
		//字符替换
		System.out.println(str01.replace('b','g'));
		
		
	}

}
