package interfaceExample;

public class Fish implements Swimmable {

	@Override
	/* Implement the swim method from the Swimmable interface */
	public void swim(int howFar) {
		System.out.println("I'm a fish, and I'm swimming " + howFar);
	}

	@Override
	/* Implement the dive method from the Swimmable interface */
	public void dive(int howDeep) {
		System.out.println("I'm a fish, and I'm diving " + howDeep);
	}

}
