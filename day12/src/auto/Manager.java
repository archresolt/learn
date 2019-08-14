package auto;

import java.util.Scanner;

public class Manager {
	//��ų������еĳ�
	private Auto [] inCar = {
			new Car("����", "��ɫ", 2, 800.f),
			new Car("����", "��ɫ", 2, 800.f),
			new Car("������", "��ɫ", 2, 1800.f),
			new Car("��ʱ��", "��ɫ", 2, 2800.f),
			new Car("��������", "��ɫ", 2, 3800.f),
			null,null,null,null,null
			
	};
	//����Ѿ����ȥ�ĳ�
	private Auto [] outCar = {
			new Car("������", "��ɫ", 2, 200.f),
			new Car("���ǵ�", "��ɫ", 2, 400.f),
			new Car("����", "��ɫ", 2, 600.f),
			null,null,null,null,null,null,null,
	};
	
	Scanner input = new Scanner(System.in);
	
	public void	 shouMainMenu(){
		System.out.println("��ӭʹ����ѧ����������ϵͳ");
		System.out.println("================================");
		System.out.println("1,�⳵ 2,���� 3,�³���� 4,�˳�");
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
			System.out.println("�������");
			break;
		}
	
	}
	
	/**
	 * �⳵
	 */
	public void getCar() {
		showAutoArray(inCar);
		System.out.println("��������Ҫ���õĳ����ñ��");
		int no = input.nextInt();
		//��ȡ�û���Ҫ���õĳ����Ķ���
		Auto auto = inCar[no-1];
		inCar[no-1] = null;
		//���ö����incar������ɾ��   ��ӵ�outCar�����м���
		//���ö����inCar������ɾ��
		for (int i = no-1; i < inCar.length-1; i++) {
			inCar[i] = inCar[i+1];
		}
		inCar[inCar.length-1] = null;
		
		//�ٽ��ö�����ӵ�outCar������
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
	 * ����
	 */
	public void backCar() {
		showAutoArray(outCar);
		System.out.println("������Ҫ���ĳ������");
		int index = input.nextInt();
		System.out.println("�����������õ�����");
		int day = input.nextInt();
		Auto auto = outCar[index-1];
		System.out.println("�������"+auto.moneyCount(day));
		//���û������ĳ�����outCar��ɾ����������ӵ�inCar��
		outCar[index] = null;
		for (int i = index; i < inCar.length-1; i++) {
			outCar[i] = outCar[i+1];
		}
		outCar[outCar.length-1] = null;
		
		//���û��������ĳ����뵽inCar������
		int n = 0;
		for (int i = 0; i < inCar.length; i++) {
			Auto at = inCar[i];
			if (at == null) {
				n = i;
				break;
			}
			
		}
		inCar[n] = auto;
		//չʾ��δ���ĳ����б�
		showAutoArray(outCar);
		
	}
	/**
	 * �³����
	 */
	public void newCar() {
		System.out.println("��ѡ����������1,�γ�  2,����");
		int type = input.nextInt();
		Auto auto = null;
		System.out.println("�����복�ƺ�");
		String carID = input.next();
		System.out.println("��������������");
		String carName = input.next();
		System.out.println("�����복����ɫ");
		String carColor = input.next();
		System.out.println("�����복������");
		int carAge = input.nextInt();
		System.out.println("�����������");
		float carPrice = input.nextFloat();
		if (type == 1) {
			auto = new Car(carName, carColor, carAge, carPrice);
		}else {
			System.out.println("�����뿨���Ķ�λ");
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
		System.out.println("���\t����\t��ɫ\tʹ������\t�����\t��������");
		for (int i = 0; i < auto.length; i++) {
			if (auto[i] == null) {
				break;
			}
			System.out.print(i+1+"\t");
			System.out.println(auto[i]);
		}
	}
	
}
