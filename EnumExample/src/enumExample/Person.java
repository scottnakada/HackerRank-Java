package enumExample;

/* Declare a person class */
public class Person {
	
	/* Define a hairColor instance variable of type HairColor */
	HairColors hairColor;
	
	/* Constructor for the Person class */
	Person(HairColors hairColorIn) {
		hairColor = hairColorIn;
	}
	
	/* Getters and Setters */
	/* Get this persons hair color */
	public HairColors getHairColor() {
		return hairColor;
	}
	
	/* Set this persons hair color */
	public void setHairColor(HairColors hairColorIn) {
		hairColor = hairColorIn;
	}
	
}
