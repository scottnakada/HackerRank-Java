/* Class MyBook, subclass of Book */
public class MyBook extends Book {
	
	/* Define the price as a class variable */
	public int price;
	
	/* Contstructore for MyBook class */
	MyBook(String titleIn, String authorIn, int priceIn) {
		/* Create the super class Book */
		super(titleIn, authorIn);
		/* Initialize the price, from the input price value */
		price = priceIn;
	}

	/* Override the display method from the super Class Book */
	@Override
	/* Display the information about the book */
	void display() {
		/* Print out the title, author, and price for the book */
		System.out.println("Title: " + title);
	    System.out.println("Author: " + author);
	    System.out.println("Price: " + price);
	}
	
}
