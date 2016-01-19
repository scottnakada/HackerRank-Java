package interfaceExample;

public class Dog implements Swimmable, Talkative {

	@Override
	/* Implement the talk method from the Talkative interface */
	public void talk() {
		System.out.println("Bark! Bark-bark!");
	}

	@Override
	/* Implement the swim method from the Swimmable interface */
	public void swim(int howFar) {
		System.out.println("I'm a dog, and I'm swimming " + howFar);
	}

	@Override
	/* Implement the dive method from the Swimmable interface */
	public void dive(int howDeep) {
		System.out.println("I'm a dog, and I'm diveing " + howDeep);
	}

}
