
public class MainClass {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird("Johnny");
		Dog dog = new Dog("Brillo");
		
		animal.sleep();
		animal.eat();
		
		bird.sleep();
		bird.eat();
		
		dog.sleep();
		dog.eat();

	}

}
