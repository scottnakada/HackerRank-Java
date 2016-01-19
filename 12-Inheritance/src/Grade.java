
public class Grade extends Student {
	/* Local variables for the Grade class */
	private int score;
	/* Constructor for the Grade Class */
    Grade (String firstNameIn, String lastNameIn, int phoneIn, int scoreIn) {
    	/* Create a Student object */
        super(firstNameIn, lastNameIn, phoneIn);
        /* Initialize the local variables for the Grade class */
        score = scoreIn;
    }
    
    /* Calculate the grade, based upon the student's score */
    public char calculate() {
    	/* 0-39 = 'D' */
        if (score < 40) {
            return 'D';
        /* 40-59 = 'B' */
        } else if (score < 60) {
            return 'B';
        /* 60-74 = 'A' */
        } else if (score < 75) {
            return 'A';
        /* 75-89 = 'E' */
        } else if (score < 90) {
        	return 'E';
        }
        /* Otherwise, grade is 'O' */
        return 'O';
    }
   
}
