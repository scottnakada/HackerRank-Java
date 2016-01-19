package interfaceExample;

public class Main {
	
	/* Start the program here */
	public static void main(String[] args) {
		System.out.println("Examples of Java Interfaces");
		
		System.out.println("Instantiate a Parrot, which implements Talkative");
		Parrot polly = new Parrot();
		polly.talk();
		System.out.println();
		
		System.out.println("Instantiate a Fish, which implements Swimmable");
		Fish sam = new Fish();
		sam.swim(10);
		sam.dive(5);
		System.out.println();
		
		System.out.println("Instantiate a Dog, which implements Talkative " +
				"and Swimmable interfaces");
		Dog brillo = new Dog();
		brillo.talk();
		brillo.swim(2);
		brillo.dive(1);
	}

}
