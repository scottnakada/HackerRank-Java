
public class Student {
	/* Declare some internal data items */
	protected String firstName;
	protected String lastName;
	int phone;
	
	/* Constructor for the Student class */
	Student(String firstNameIn, String lastNameIn, int phoneIn) {
		firstName = firstNameIn;
		lastName = lastNameIn;
		phone = phoneIn;
	}
	
	/* Display the information for the student */
	public void display() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Phone: " + phone);
	}
}
