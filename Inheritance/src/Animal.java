
public class Animal {
	
	public String name = "Generic Animal";
	
	public Animal() {
		System.out.println("A new " + name + " has been created!");
	}

	public void sleep() {
		System.out.println("An " + name + " sleeps...");
	}
	
	public void eat() {
		System.out.println("An " + name + " eats...");
	}
}
