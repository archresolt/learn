package ZuAuto;

import java.util.Scanner;

import auto.Auto;
import auto.Car;
import auto.Trcuk;

public class Manager {
	private Auto[] inCar = { new Car("奔驰", "黑色", 2, 800.f),
			new Car("宝马", "黑色", 2, 800.f), new Car("法拉利", "红色", 2, 1800.f),
			new Car("保时捷", "百色", 2, 2800.f), new Car("兰博基尼", "黄色", 2, 3800.f),
			null, null, null, null, null

	};
	// 存放已经租出去的车
	private Auto[] outCar = { new Car("五菱宏光", "黑色", 2, 200.f),
			new Car("比亚迪", "黑色", 2, 400.f), new Car("哈弗", "红色", 2, 600.f),
			null, null, null, null, null, null, null, };

	Scanner input = new Scanner(System.in);

	public void showMainMenu() {
		System.out.println("欢迎使用尚学堂汽车租赁系统");
		System.out.println("================================");
		System.out.println("1,租车 2,还车 3,新车入库 4,退出");
		int flag = input.nextInt();
		switch (flag) {
		case 1:
			getCar();
			showMainMenu();
			break;
		case 2:
			backCar();
			showMainMenu();
			break;
		case 3:
			newCar();
			showMainMenu();
			break;

		default:
			System.out.println("程序结束");
			break;
		}

	}

	// 租车
	public void getCar() {
		showAutoArray(inCar);
		System.out.println("请输入所要租用车辆的编号");
		int i = input.nextInt();
		Auto auto = inCar[i - 1];
		inCar[i - 1] = null;
		// 将该对象从inCar数组中删除，并将它添加到outCar数组中
		for (int j = i - 1; j < inCar.length - 1; j++) {
			inCar[j] = inCar[j + 1];
		}
		inCar[inCar.length - 1] = null;
		// 将该对象加入outCar数组中
		int index = 0;
		for (int h = 0; h < outCar.length; h++) {
			if (outCar[h] == null) {
				index = h;
				break;
			}
			outCar[index] = auto;
		}
		showAutoArray(inCar);
	}

	// 还车
	public void backCar() {
		showAutoArray(outCar);
		System.out.println("请输入要还车辆的编号");
		int index = input.nextInt();
		System.out.println("请输入租用车辆的天数");
		int day = input.nextInt();

		Auto auto = outCar[index - 1];
		System.out.println("总租金是" + auto.moneyCount(day));

		outCar[index - 1] = null;
		// 将所还车辆从outCar数组中删除，并将后面的元素往前挪一位
		for (int j = index - 1; j < outCar.length - 1; j++) {
			outCar[j] = outCar[j + 1];

		}
		outCar[outCar.length - 1] = null;
		// 将所还的车辆添加到inCar数组中去
		for (int i = 0; i < inCar.length; i++) {
			if (inCar[i] == null) {
				inCar[i] = auto;
				break;
			}

		}
		// 展示暂未还的车辆列表
		showAutoArray(outCar);
	}
	
	//新增车辆
	public void newCar(){
		System.out.println("请选择车辆的类型1，轿车2，卡车");
		int type = input.nextInt();
		Auto auto = null ;
		System.out.println("请输入车牌号");
		int carId = input.nextInt();
		System.out.println("请输入汽车类型");
		String carName = input.next();
		System.out.println("请输入车辆颜色");
		String carColor = input.next();
		System.out.println("请输入车辆年限");
		int carAge = input.nextInt();
		System.out.println("请输入车辆日租金");
		int carPrice = input.nextInt();
		if (type==1){
			auto = new Car (carName , carColor,carAge,carPrice);
		}else{
			System.out.println("请输入卡车的吨位");
			int t = input.nextInt();
			auto = new Trcuk(carName,carColor,carAge,carPrice,t);
			
		}
		int index = 0;
		for (int g = 0;g < inCar.length;g++){
			if(inCar[g]==null){
				index = g;
				break;
			}
			inCar[index] = auto;
		}

		
		
	}

	// 显示数组
	public void showAutoArray(Auto[] auto) {
		System.out.println("序号/t 车名/t 颜色/t 使用时长日租金 /t");
		for (int i = 0; i < auto.length; i++) {
			if (auto[i] == null) {
				break;
			}
			System.out.print(i + 1 + "/t");
			System.out.println(auto[i]);

		}

	}
}
