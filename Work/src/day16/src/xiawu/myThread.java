package xiawu;

import java.lang.reflect.Method;

public final class myThread extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("·ÖÏß³Ì" + i);
		}
	}

	void test(Method t){
		
	}

}
