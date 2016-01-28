package user;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	/* Properties for the user */
	String username;
    String password;
    int age;
    /* A set of orders for this user */
    Set<Integer> orderIDs;
    
    /* Constructor for the database */
    public User(String customUserName, String customPassword,
    		int customAge, Set<Integer> orderIDs) {
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

	public static void main(String[] args) {
		/* Create a hashset for storing the orders */
		Set userOrders = new HashSet();
		
		/* Add order 1212 to the set of orders for this user */
        userOrders.add(1212);
        
        /* Create a new user */
        User scott = new User("scottnakada",
        		"password",
        		59,
        		userOrders);

	}

}
