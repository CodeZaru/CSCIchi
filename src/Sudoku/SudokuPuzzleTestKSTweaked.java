//the top half of this class is a bunch of methods being defined, and
//the bottom half has a main method...
public class SudokuPuzzleTestKSTweaked {
	
//it looks like this is a declared constant
//if so, should we do all caps?
//still it is hard to follow how this object was instantiated...
    private static final SudokuPuzzleSolutionKSPractice game = new SudokuPuzzleSolutionKSPractice();
    
    private static void initializeBoard() {
        game.addInitial(0, 0, 1);
        game.addInitial(0, 1, 2);
        game.addInitial(0, 2, 3);
        game.addInitial(0, 3, 4);
        game.addInitial(0, 4, 9);
        game.addInitial(0, 5, 7);
        game.addInitial(0, 6, 8);
        game.addInitial(0, 7, 6);
        game.addInitial(0, 8, 5);
        game.addInitial(1, 0, 4);        
        game.addInitial(1, 1, 5);
        game.addInitial(1, 2, 9);
        game.addInitial(2, 0, 6);
        game.addInitial(2, 1, 7);
        game.addInitial(2, 2, 8);
        
        game.addInitial(3, 0, 3);
        game.addInitial(3, 4, 1);
        
        game.addInitial(4, 0, 2);        
        
        game.addInitial(5, 0, 9);
        game.addInitial(5, 5, 5);
        
        game.addInitial(6, 0, 8);
        
        game.addInitial(7, 0, 7);
        game.addInitial(8, 0, 5);        
        game.addInitial(8, 3, 9); 
    }
    //KSNotes:
    //testToString is a test that actually takes a typed out String as an array
    //defines the typed out array as the expected result given 
    //a sudoku add guess scenario and then checks 
    //if the toString method from the real program which shows the 
    //same "array-string" as the "answer key" does.
    private static boolean testToString() {
        String answer = "1 2 3 4 9 7 8 6 5 \n" +
                        "4 5 9 _ _ _ _ _ _ \n" +
                        "6 7 8 _ _ _ _ _ _ \n" +
                        "3 _ _ _ 1 _ _ _ _ \n" +
                        "2 _ _ _ _ _ _ _ _ \n" +
                        "9 _ _ _ _ 5 _ _ _ \n" +
                        "8 _ _ _ _ _ _ _ _ \n" +
                        "7 _ _ _ _ _ _ _ _ \n" +
                        "5 _ _ 9 _ _ _ _ _ \n";
//analyze the return statement: to string of the game object passed into a 
//comparison function of the string object that assigned to the variable "answer"
//and had been manually defined above (a concatenated string with line breaks to  
//simulate the Sudoku array), and the evaluation is all done in the return statement.
        return (answer.equalsIgnoreCase(game.toString()));
    }
    
    private static boolean testAddGuess1() {
        String answer = "1 2 3 4 9 7 8 6 5 \n" +
                        "4 5 9 _ _ _ _ _ _ \n" +
                        "6 7 8 5 _ _ _ _ _ \n" +
                        "3 _ _ _ 1 _ _ _ _ \n" +
                        "2 _ _ _ _ _ _ _ _ \n" +
                        "9 _ _ _ _ 5 _ _ _ \n" +
                        "8 _ _ _ _ _ _ _ _ \n" +
                        "7 _ _ _ _ _ _ _ _ \n" +
                        "5 _ _ 9 _ _ _ _ _ \n";

        return (answer.equalsIgnoreCase(game.toString()));
    }    
    
    private static boolean testAddGuess2() {
        String answer = "1 2 3 4 9 7 8 6 5 \n" +
                        "4 5 9 _ _ _ _ _ _ \n" +
                        "6 7 8 5 _ _ _ _ _ \n" +
                        "3 _ _ _ 1 _ _ _ _ \n" +
                        "2 _ _ _ _ _ _ _ _ \n" +
                        "9 _ _ _ _ 5 _ _ _ \n" +
                        "8 _ _ _ _ _ _ _ _ \n" +
                        "7 _ _ _ _ _ _ _ _ \n" +
                        "5 _ _ 9 _ _ _ _ _ \n";

        return (answer.equalsIgnoreCase(game.toString()));
    }    
    
    private static boolean testAddGuess3() {
        String answer = "1 2 3 4 9 7 8 6 5 \n" +
                        "4 5 9 _ _ _ _ _ _ \n" +
                        "6 7 8 5 _ _ _ _ _ \n" +
                        "3 _ _ _ 1 _ _ _ _ \n" +
                        "2 _ _ _ _ _ _ _ _ \n" +
                        "9 _ _ _ _ 5 _ _ _ \n" +
                        "8 _ _ _ _ _ _ _ _ \n" +
                        "7 _ _ _ _ _ _ _ _ \n" +
                        "5 _ _ 9 _ _ _ _ _ \n";

        return (answer.equalsIgnoreCase(game.toString()));
    }     
    
//this is a method definition that is passed in a boolean array (a[]) and it returns 
//all the array values, but what does  !a[4] !a[8] actually mean/do... 
//(note: the array has an assumed size, the sudoku board length).
    private static boolean testGetAllowedValues(boolean a[]) {
        return a[0] && a[1] && a[2] && a[3] && !a[4] && a[5] && a[6] && a[7] && !a[8];
    }
//MAIN METHOD STARTS HERE....    
    public static void main(String[] args) {
        int grade = 0;
        
        initializeBoard();
        
        System.out.println(game);
//getValueIn is a simple getter method the returns value at given array index        
        if (game.getValueIn(1, 1) == 5)
            grade += 5;
        else
            System.out.println("getValueIn(r,c) test failed");
//confirms that to string was done correctly        
        if (testToString()) 
            grade += 5;
        else
            System.out.println("toString() test failed");
//testAddGuess1() test tries to add a guess (value to array index) that depends on boolean flag states        
        game.addGuess(2, 3, 5);
        if (testAddGuess1()) 
            grade += 5;
        else
            System.out.println("addGuess(r,c,v) test 1 failed");        
//testAddGuess2() test tries to add a guess (value to array index) that depends on boolean flag states        
        game.addGuess(2, 2, 5);
        if (testAddGuess2()) 
            grade += 5;
        else
            System.out.println("addGuess(r,c,v) test 2 failed");         
//testAddGuess3() test tries to add a guess (value to array index) that depends on boolean flag states        
        game.addGuess(2, 4, 1);
        if (testAddGuess3()) 
            grade += 10;
        else
            System.out.println("addGuess(r,c,v) test 3 failed");         
 //tests reset(), by re-running the first toString test above, after running game.reset()       
        game.reset();
        if (testToString())
            grade += 10;
        else
            System.out.println("reset() test failed");
//tests the game.getAllowedValues method by passing the game object method call and hence it's results
//to the testGetAllowedValues(), which appears to only apply to one cell/array index at a time
//so if I am correct this is saying what values can be used at coordinates 8, 8.
//the answer that it uses to compare is a visual/manual analysis of expected results for cell 8, 8.        
        if (testGetAllowedValues(game.getAllowedValues(8, 8)))
            grade += 10;
        else
            System.out.println("getAllowedValues() test failed");
        
        System.out.printf("Your grade is %d/50.\n", grade);
    }
}