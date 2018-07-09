public class SudokuPuzzleTest {
    private static final SudokuPuzzle2 game = new SudokuPuzzle2();
    
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
    
    private static boolean testGetAllowedValues(boolean a[]) {
        return a[0] && a[1] && a[2] && a[3] && !a[4] && a[5] && a[6] && a[7] && !a[8];
    }
    
    public static void main(String[] args) {
        int grade = 0;
        
        initializeBoard();
        
        System.out.println(game);
        
        if (game.getValueIn(1, 1) == 5)
            grade += 5;
        else
            System.out.println("getValueIn(r,c) test failed");
        
        if (testToString()) 
            grade += 5;
        else
            System.out.println("toString() test failed");
        
        game.addGuess(2, 3, 5);
        if (testAddGuess1()) 
            grade += 5;
        else
            System.out.println("addGuess(r,c,v) test 1 failed");        
        
        game.addGuess(2, 2, 5);
        if (testAddGuess2()) 
            grade += 5;
        else
            System.out.println("addGuess(r,c,v) test 2 failed");         
        
        game.addGuess(2, 4, 1);
        if (testAddGuess3()) 
            grade += 10;
        else
            System.out.println("addGuess(r,c,v) test 3 failed");         
        
        game.reset();
        if (testToString())
            grade += 10;
        else
            System.out.println("reset() test failed");
        
        if (testGetAllowedValues(game.getAllowedValues(8, 8)))
            grade += 10;
        else
            System.out.println("getAllowedValues() test failed");
        
        System.out.printf("Your grade is %d/50.\n", grade);
    }
}