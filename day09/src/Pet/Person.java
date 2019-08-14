package Pet;

import java.util.Scanner;

public class Person {
	public Pet getPet() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要选择的宠物1,狗,2,猫,3,猪");
		int i = input.nextInt();
		Pet pet = null;
		if (i == 1) {
			pet = new Dog();
		}else if (i==2){
			pet = new Cat();
		}else {
			pet = new Pig();
		}

		return pet;
	}	
		public void feed(Pet pet){
			pet.eat();
		}
	}

