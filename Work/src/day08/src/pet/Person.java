package pet;

import java.util.Scanner;

public class Person {
	/**
	 * ��������ķ���
	 * �����������Ϊ��������ֵ������
	 * @return
	 */
	public Pet getPet() {
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ�����ĳ�������� 1���� 2��è 3����");
		int type = input.nextInt();
		Pet pet = null;
		if (type == 1) {
			pet = new Dog();
		}else if(type == 2){
			pet = new Cat();
		}else {
			pet = new Pig();
		}
		
		return pet;
	}
	
	public void feed(Pet pet) {
		pet.eat();
	}

}
