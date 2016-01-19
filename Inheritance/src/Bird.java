
public class Bird extends Animal {
	
	public Bird(String newName) {
		super();
		name = "Bird named " + newName;
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
