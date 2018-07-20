
public class SudokuTestGetAllowedValues {

	public static void main(String[] args) {
		
		SudokuPractice game = new SudokuPractice();
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
        //test
        game.addInitial(2, 3, 8);

        
        game.addInitial(3, 0, 3);
        game.addInitial(3, 4, 1);
        
        game.addInitial(4, 0, 2);        
        
        game.addInitial(5, 0, 9);
        game.addInitial(5, 5, 5);
        
        game.addInitial(6, 0, 8);
        
        game.addInitial(7, 0, 7);
        game.addInitial(8, 0, 5);        
        game.addInitial(8, 3, 9); 
 
    System.out.println();    
	System.out.println("*********************************************************************");
	System.out.println("TEST OF GetAllowedValues Method  ************************************");
	System.out.println("NOTE: TEST-PRINT OF FIRST toString(): the current values on the board");
	System.out.println("*********************************************************************");
	System.out.println("*********************************************************************");
	System.out.println(game.toString());//toString is lets us output objects visually 
	//if we comment out the toString method completely, then we see the objects class
	//and memory location
    System.out.println();
	System.out.println("*********************************************************************");
	System.out.println("*********************************************************************");
	System.out.println("NOTE:     TEST-PRINT OF SECOND toString2 method: the Boolean Flags");
	System.out.println("*********************************************************************");
	System.out.println("*********************************************************************");


		
	    System.out.println();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("NOTE:     TEST-PRINT OF getAllowedValues method***********************************************************************");
		System.out.println("1) Takes a cell (row, col) value and stores the real value in a temp, so we ");
		System.out.println("   don't lose it with the for loop operation.");
	    System.out.println();
		System.out.println("2) In a simple for loop, the method iterates values 1-9 into the cell (row, col) and run the three validation"); 				
		System.out.println("   tests and generate an array of FLAGS associated with the values at each index values = i+1.");
	    System.out.println();
	    System.out.println("3) Sets the original cell (row, col) back to its value stored in temp and returns the boolean ");
		System.out.println("   array of FLAGS (can write code that prints the index + 1 if boolean value is true)"); 
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		
		System.out.println(game.toString2());	
		
		boolean [] testGetAllowedValues = game.getAllowedValues(2 ,3);


	}

}
