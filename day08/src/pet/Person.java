package pet;

import java.util.Scanner;

public class Person {
	/**
	 * 领养宠物的方法
	 * 父类的类型作为方法返回值的类型
	 * @return
	 */
	public Pet getPet() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入索要领养的宠物的类型 1，狗 2，猫 3，猪");
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
