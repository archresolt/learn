package Neibulei;

import Neibulei.OutClass.InnerClass;

public class Test {
	public static void main(String[] args) {
		OutClass oc = new OutClass();
		InnerClass ic = oc.new InnerClass();
		ic.test();
		
		
	}

}
