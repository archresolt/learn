
package Pet;

public class Text {
public static void main(String[] args) {
	Person xiaoming = new Person();
	Pet pet = xiaoming.getPet();
	System.out.println(pet);
	xiaoming.feed(pet);
}
}
