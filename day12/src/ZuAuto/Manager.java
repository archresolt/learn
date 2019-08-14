package ZuAuto;

import java.util.Scanner;

import auto.Auto;
import auto.Car;
import auto.Trcuk;

public class Manager {
	private Auto[] inCar = { new Car("����", "��ɫ", 2, 800.f),
			new Car("����", "��ɫ", 2, 800.f), new Car("������", "��ɫ", 2, 1800.f),
			new Car("��ʱ��", "��ɫ", 2, 2800.f), new Car("��������", "��ɫ", 2, 3800.f),
			null, null, null, null, null

	};
	// ����Ѿ����ȥ�ĳ�
	private Auto[] outCar = { new Car("������", "��ɫ", 2, 200.f),
			new Car("���ǵ�", "��ɫ", 2, 400.f), new Car("����", "��ɫ", 2, 600.f),
			null, null, null, null, null, null, null, };

	Scanner input = new Scanner(System.in);

	public void showMainMenu() {
		System.out.println("��ӭʹ����ѧ����������ϵͳ");
		System.out.println("================================");
		System.out.println("1,�⳵ 2,���� 3,�³���� 4,�˳�");
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
			System.out.println("�������");
			break;
		}

	}

	// �⳵
	public void getCar() {
		showAutoArray(inCar);
		System.out.println("��������Ҫ���ó����ı��");
		int i = input.nextInt();
		Auto auto = inCar[i - 1];
		inCar[i - 1] = null;
		// ���ö����inCar������ɾ������������ӵ�outCar������
		for (int j = i - 1; j < inCar.length - 1; j++) {
			inCar[j] = inCar[j + 1];
		}
		inCar[inCar.length - 1] = null;
		// ���ö������outCar������
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

	// ����
	public void backCar() {
		showAutoArray(outCar);
		System.out.println("������Ҫ�������ı��");
		int index = input.nextInt();
		System.out.println("���������ó���������");
		int day = input.nextInt();

		Auto auto = outCar[index - 1];
		System.out.println("�������" + auto.moneyCount(day));

		outCar[index - 1] = null;
		// ������������outCar������ɾ�������������Ԫ����ǰŲһλ
		for (int j = index - 1; j < outCar.length - 1; j++) {
			outCar[j] = outCar[j + 1];

		}
		outCar[outCar.length - 1] = null;
		// �������ĳ�����ӵ�inCar������ȥ
		for (int i = 0; i < inCar.length; i++) {
			if (inCar[i] == null) {
				inCar[i] = auto;
				break;
			}

		}
		// չʾ��δ���ĳ����б�
		showAutoArray(outCar);
	}
	
	//��������
	public void newCar(){
		System.out.println("��ѡ����������1���γ�2������");
		int type = input.nextInt();
		Auto auto = null ;
		System.out.println("�����복�ƺ�");
		int carId = input.nextInt();
		System.out.println("��������������");
		String carName = input.next();
		System.out.println("�����복����ɫ");
		String carColor = input.next();
		System.out.println("�����복������");
		int carAge = input.nextInt();
		System.out.println("�����복�������");
		int carPrice = input.nextInt();
		if (type==1){
			auto = new Car (carName , carColor,carAge,carPrice);
		}else{
			System.out.println("�����뿨���Ķ�λ");
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

	// ��ʾ����
	public void showAutoArray(Auto[] auto) {
		System.out.println("���/t ����/t ��ɫ/t ʹ��ʱ������� /t");
		for (int i = 0; i < auto.length; i++) {
			if (auto[i] == null) {
				break;
			}
			System.out.print(i + 1 + "/t");
			System.out.println(auto[i]);

		}

	}
}
