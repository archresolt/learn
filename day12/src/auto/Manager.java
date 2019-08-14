package auto;

import java.util.Scanner;

public class Manager {
	//存放车库现有的车
	private Auto [] inCar = {
			new Car("奔驰", "黑色", 2, 800.f),
			new Car("宝马", "黑色", 2, 800.f),
			new Car("法拉利", "红色", 2, 1800.f),
			new Car("保时捷", "百色", 2, 2800.f),
			new Car("兰博基尼", "黄色", 2, 3800.f),
			null,null,null,null,null
			
	};
	//存放已经租出去的车
	private Auto [] outCar = {
			new Car("五菱宏光", "黑色", 2, 200.f),
			new Car("比亚迪", "黑色", 2, 400.f),
			new Car("哈弗", "红色", 2, 600.f),
			null,null,null,null,null,null,null,
	};
	
	Scanner input = new Scanner(System.in);
	
	public void	 shouMainMenu(){
		System.out.println("欢迎使用尚学堂汽车租赁系统");
		System.out.println("================================");
		System.out.println("1,租车 2,还车 3,新车入库 4,退出");
		int flag = input.nextInt();
		switch (flag) {
		case 1:
			getCar();
			shouMainMenu();
			break;
		case 2:
			backCar();
			shouMainMenu();
			break;
		case 3:
			newCar();
			shouMainMenu();
			break;

		default:
			System.out.println("程序结束");
			break;
		}
	
	}
	
	/**
	 * 租车
	 */
	public void getCar() {
		showAutoArray(inCar);
		System.out.println("请输入索要租用的车辆得编号");
		int no = input.nextInt();
		//获取用户索要租用的车辆的对象
		Auto auto = inCar[no-1];
		inCar[no-1] = null;
		//将该对象从incar数组中删除   添加到outCar数组中即可
		//将该对象从inCar数组中删除
		for (int i = no-1; i < inCar.length-1; i++) {
			inCar[i] = inCar[i+1];
		}
		inCar[inCar.length-1] = null;
		
		//再将该对象添加到outCar数组中
		int index = 0;
		for (int i = 0; i < outCar.length; i++) {
			if (outCar[i] == null) {
				index = i;
				break;
			}
		}
		outCar[index] = auto;
		
		showAutoArray(inCar);
		
	}
	/**
	 * 还车
	 */
	public void backCar() {
		showAutoArray(outCar);
		System.out.println("请输入要还的车辆编号");
		int index = input.nextInt();
		System.out.println("请输入所租用的天数");
		int day = input.nextInt();
		Auto auto = outCar[index-1];
		System.out.println("总租金是"+auto.moneyCount(day));
		//将用户所还的车辆从outCar中删除，并且添加到inCar中
		outCar[index] = null;
		for (int i = index; i < inCar.length-1; i++) {
			outCar[i] = outCar[i+1];
		}
		outCar[outCar.length-1] = null;
		
		//将用户换回来的车存入到inCar数组中
		int n = 0;
		for (int i = 0; i < inCar.length; i++) {
			Auto at = inCar[i];
			if (at == null) {
				n = i;
				break;
			}
			
		}
		inCar[n] = auto;
		//展示暂未还的车辆列表
		showAutoArray(outCar);
		
	}
	/**
	 * 新车入库
	 */
	public void newCar() {
		System.out.println("请选择车辆的类型1,轿车  2,卡车");
		int type = input.nextInt();
		Auto auto = null;
		System.out.println("请输入车牌号");
		String carID = input.next();
		System.out.println("请输入汽车类型");
		String carName = input.next();
		System.out.println("请输入车辆颜色");
		String carColor = input.next();
		System.out.println("请输入车辆年限");
		int carAge = input.nextInt();
		System.out.println("请输入日租金");
		float carPrice = input.nextFloat();
		if (type == 1) {
			auto = new Car(carName, carColor, carAge, carPrice);
		}else {
			System.out.println("请输入卡车的吨位");
			int t = input.nextInt();
			auto = new Trcuk(carName, carColor, carAge, carPrice, t);
		}
		int index = 0;
		for (int i = 0; i < inCar.length; i++) {
			Auto a = inCar[i];
			if (a == null) {
				index = i;
				break;
			}
		}
		inCar [index] = auto;
		
	}
	
	public void showAutoArray(Auto [] auto) {
		System.out.println("序号\t车名\t颜色\t使用年限\t日租金\t卡车载重");
		for (int i = 0; i < auto.length; i++) {
			if (auto[i] == null) {
				break;
			}
			System.out.print(i+1+"\t");
			System.out.println(auto[i]);
		}
	}
	
}
