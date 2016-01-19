/* Abstract book class */
public abstract class Book {
	/* Define the title and author class variables */
	String title;
	String author;
	
	/* Constructor for the Book class */
	Book(String titleIn, String authorIn) {
		/* Initialize the class variables */
		title = titleIn;
		author = authorIn;
	}
	
	/* Define a display method, which must be implemented by subclasses */
	abstract void display();
}
