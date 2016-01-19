
public class Dog extends Animal {
	public Dog(String newName) {
		super();
		name = "Dog named " + newName;
		System.out.println("A new " + name + " has been created!");
	}
	
	@Override
	public void sleep() {
		System.out.println("A " + name + " sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A " + name + " eats...");
	}
}
