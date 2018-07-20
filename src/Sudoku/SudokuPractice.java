//1) Define Sudoku arrays, two static data structures (as opposed to dynamic) to which all game values are saved.
//2) Define simple default constructor
//3) Define two toString() methods: one to use as a way to check expected values against input values
								  //two to display a boolean flag map to use as a visual sanity check
//4) Create method to addInitial() values, to set the game up...
//5) Create method to addGuess() that allows the user to input values to the board.
//6) Create validation mechanism that implements the validation logic of Sudoku to handle user data input:
			//i)	Check Row for Repeats
			//ii)	Check Column for Repeats
			//iii)	Check SubGroups for Repeats
//7) Create cumulative checking mechanism to basically just demonstrates that you can do implement an aggregate check.
	//Note that there doesn't seem to be additional benefit, because it uses the same tests as the validation step 6
	//so if the validation are flawed on the individual/granular level, it will also have the same flaw when used in a loop
//8) 
public class SudokuPractice {
	
	private final int [][] board = new int[9][9];//final makes it so that the board can't change.
	private final boolean [][] start =new boolean[9][9];//true = not editable
	
	SudokuPractice () //constructor 
	{
		
	}

	@Override
	public String toString() 
	{
		
		String result = "";//declare the return variable
	
		// the board nested loops shows for each row, nine cols.
		for(int row = 0; row < 9; row++) 
		{
			for (int col = 0; col < 9; col++) {
				//result += (board[row][col] != 0) ? board[row][col] + " " : "_ ";
				//the line below says: if value of specified cell not equal to 0, 
				//then append a space after the cell value 
				//however, if it is equal to 0, then don't show the cell value
				//instead, show an underscore and a space
				//Can be written as if else stmt below
			 	if (board[row][col] != 0)  
			 		result += board[row][col] + " ";
			 	else
			 		result += "_ ";
			}
			//after executing the inner loop code, pop out and execute the outer loop line of code

			result += "\n";

		}
        return result;
    }
	
	   public String toString2() 
	    {
		  	String result = "";
//the boolean FLAG array displays whether cell is editable or not.");			
		//the start array
		for (int r = 0; r < 9; r++) 
		{
			for (int c = 0; c < 9; c++) {
				result += start[r][c] ? "T " : "F ";
			}
			result += "\n";
		}
		
		return result;//sends the result String to the caller								
	}
//The "addInitial" method below receives coordinates and an argument, and 
//simultaneously sets FLAGS to indicate the coordinates are 
//occupied by an initial value.  In fact, that is why we actually
//created separate types of "add value" one for initial and one for 
//"addGuess" b/c they have different requirements and serve diff purposes
	public void addInitial(int row, int col, int value)
	{
		board[row][col] = value;
		start[row][col] = true; //not editable
	}
//"addGuess" method also receives as args the coordinates and values
//it performs boolean checks and if the desired boolean results are returned
//it places the value into the coordinates
	public void addGuess(int row, int col, int value) 
	{
	if(!start[row][col])// && getAllowedValues(row, col)[value - 1])
		board[row][col] = value;				
	}

//okSingleRow is a simple repeat test that iterates through an array and checks for repeating values
//if  finds a repeat, the boolean flag is used by add value to pervent the user from entering the value 
	private boolean okSingleRow(int row) 
	{
		boolean result = true;
		for (int oForIndexPCtrl = 0;  oForIndexPCtrl < 9; oForIndexPCtrl++)
			for (int iForIndexRCtrl = oForIndexPCtrl+1; iForIndexRCtrl < 9; iForIndexRCtrl++)
				if ((board[row][oForIndexPCtrl] == board[row][iForIndexRCtrl]) && (board[row][oForIndexPCtrl] != 0))
				{
					result = false;//return false;	
					System.out.println("okSingleRow Method (return " + result +"): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[row][oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[row][iForIndexRCtrl]);
				}else {
					result = true;//return true;
					System.out.println("okSingleRow Method (return " + result +"): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[row][oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[row][iForIndexRCtrl]);
				}
		System.out.println("okSingleRow Final Result= " + result);
		return result;
	}

	private boolean okSingleCol(int col)
	{
		boolean result = false;
		for (int oForIndexPCtrl = 0; oForIndexPCtrl < 9; oForIndexPCtrl++)
			for (int iForIndexRCtrl = oForIndexPCtrl+1; iForIndexRCtrl < 9; iForIndexRCtrl++)
				if((board[oForIndexPCtrl][col] == board[iForIndexRCtrl][col]) && (board[oForIndexPCtrl][col] != 0))
				{
					result = false;
					System.out.println("okSingleCol Method (return " + result +"): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[oForIndexPCtrl][col] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[iForIndexRCtrl][col]);
				} else {
					result = true;
					System.out.println("okSingleCol Method (return " + result +"): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[oForIndexPCtrl][col] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[iForIndexRCtrl][col]);					
				}
		System.out.println("okSingleCol Final Result= " + result);
		return result;
	}
	
	//need to create from scratch later
    private int[] getSingleSubgroup(int row, int col) 
    {
        int [] singleArray = new int[9];

        for (int oForIndexPCtrl = 0; oForIndexPCtrl < 3; oForIndexPCtrl++)
            for (int iForIndexRCtrl = 0; iForIndexRCtrl < 3; iForIndexRCtrl++) 
            {
            	//CodeSummary: we are taking multiDimensional arrays and transforming them into a singleDimensional array.
            	//We are defining indexes via bracketed equations.
            	//left-hand side assigns to "singleArray" an index value derived from an equation that has two parts
            	//or two inputs added together: [oForIndexPCtrl * 3 + iForIndexRCtrl]
            	//part1: oForIndexPCtrl * 3 is tied to the  outer loop and will result in (0 or 1 or 2) * 3 which equals 0 or 3 or 6 
            	//part2: iForIndexRCtrl is tied to the  inner loop and will result in 0 or 1 or 2.
            	//Since the outer loop runs three times, each time iterating thru the inner loop of three iterations, 
            	//the inner loop's code runs a total or 9 times 
                //interestingly, the left side index value is updated via the above equation, but the value assigned to 
            	//each of the 9 indexes is set by the right side of the assignment statement.
            	//The right side of the equation = board[row / 3 * 3 + oForIndexPCtrl][col / 3 * 3 + iForIndexRCtrl] is determined by its coordinates
            	//the coordinates are two indexes are the result of two equations that define an index for a row and for a column
            	//the first index determines the row based on a row argument passed into an equation that also includes the outer 
            	//loop's index (this might mean that in general the outer loop is associated with the "row" concept of a record).
            	//Same as the left side of the assigment statement, any references to the inner and outer loop indexes result in 0 or 1 or 2
            	//so this can be rewritten as board[row / 3 * 3 + (0 or 1 or 2)][col / 3 * 3 + (0 or 1 or 2)];
            	//the args row and col result in one value each that remains the same thru all 9 loop iterations, or for 
            	//the whole subGroup array. IMPORTANTLY: this is due to int math, where the decimals are dropped/truncated.
            	//THUS TRANSITIONS to the next SUPER ROW/COL are at factors of 3.
            	singleArray[oForIndexPCtrl * 3 + iForIndexRCtrl] = board[row / 3 * 3 + oForIndexPCtrl][col / 3 * 3 + iForIndexRCtrl];
				System.out.println("getSingleSubgroup Method (return array): singleArray[" + ((oForIndexPCtrl * 3)+iForIndexRCtrl) + "] is assigned board["+(row / 3 * 3)+ " + " + oForIndexPCtrl + " or index row " + ((row / 3 * 3) + oForIndexPCtrl) +"]["+(col / 3 * 3)+ " + " + iForIndexRCtrl + " or index col " + ((col / 3 * 3) + iForIndexRCtrl)  +"] = " + board[(row / 3 * 3) + oForIndexPCtrl][(col / 3 * 3) + iForIndexRCtrl]);
            }
        return singleArray;
    }

    private boolean okSingleSubgroup(int[] subGroup) 
    {
    	boolean result = false;
    	for (int oForIndexPCtrl = 0; oForIndexPCtrl < 9; oForIndexPCtrl++) 
    		for (int iForIndexRCtrl = oForIndexPCtrl + 1; iForIndexRCtrl < 9; iForIndexRCtrl++)
    		 	if((subGroup[oForIndexPCtrl] == subGroup[iForIndexRCtrl]) && (subGroup[oForIndexPCtrl] != 0))
				{
					System.out.println("okSingleSubgroup Method (return false): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + subGroup[oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + subGroup[iForIndexRCtrl]);
					result = false;
				} else {
					System.out.println("okSingleSubgroup Method (return true): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + subGroup[oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + subGroup[iForIndexRCtrl]);
					result = true;
				}
		System.out.println("okSingleSubgroup Final Result= " + result);
		return result;
    }
    //Straight forward "getter" method
    public int getValueIn(int row, int col) {
        return board[row][col];
    }
    	
    public boolean[] getAllowedValues(int row, int col) {
        boolean [] result = new boolean[9];
        int [] tentaValues = new int[9];
        int temp = getValueIn(row, col);//store real value at cell (row,col), so we don't lose it with the for loop operation.

        for (int i = 0; i < 9; i++) {  // Tentatively placing 1-9 to the block (I think block refers to cell (row, col) arg's coordinates)
        	board[row][col] = i + 1;//iterate values 1-9 into the cell and in the line of code below
            tentaValues[i] = board[row][col];
            System.out.println("Tentative values in given cell (row, col): " + tentaValues[i]);

        	//run the three validation tests and generate an array of FLAGS associated with the values at each index values = i+1.
            
            result[i] = okSingleRow(row) && okSingleCol(col) && okSingleSubgroup(getSingleSubgroup(row, col));
            

            System.out.println("Tentative values and their Validattion results (given cell (row, col)): " + tentaValues[i] + " = " + result[i]);
        }
//        System.out.println("Tentative values and Validattion results of in given cell (row, col): " + + result[i] + " = " + board[row][col]);
  //      System.out.println("Validattion results of Tentative values in given cell (row, col): " + board[row][col] + result[i]);
        board[row][col] = temp;//set the value back to the original

        for (int j = 0; j < 9; j++)
        //	if(result[j] == true)
        	{
           		System.out.println("Validation result: " + result[j] + " = " + (j+1));
        	//} else {
             //   System.out.println("Not Allowed: " + (j+1));
        	}
        
        return  result;//return the boolean array of FLAGS (can write code that prints the index + 1 if boolean value is true)

    }


   
//####################################################################
//####################################################################
//####	NOTE: These methods are included for completeness, But they ##
//####  DON'T seem to add much actual validation value  ##############
//####  See notes at the top of this class for explanation why #######
//####################################################################
//####################################################################

 //"okRows" method works in combination with "okSingleRow" method.
 //"okRows" iterates through all the rows and calls the okSingleRow()
 //and returns false if (!okSingleRow)
 	private boolean okRows() 
 	{
 		for (int row = 0; row < 9; row++)
 			if (!okSingleRow(row))
 				return false;
 		return true;				
 	}
   
	//okCols() like okRows() basically a For Loop that calls okSingleRow/Col
	//and checks to see if the boolean value returned is true
	//if !ok or in other words !true, then a false FLAG is set
	//this logic operator/false FLAG has implications for user updates
	//if the false FLAG is set, the user can't update..  In my version, I'll try to return to the user a hint of 
	//which logic test got flagged.   

	private boolean okCols() 
	{
		for (int col = 0; col < 9; col++)
			if (!okSingleCol(col))
				return false;
		return true;
	}

	   private boolean okSubgroups() {
	        for (int majorRow = 0; majorRow < 3; majorRow++) 
	            for (int majorCol = 0; majorCol < 3; majorCol++)
	                if (!okSingleSubgroup(getSingleSubgroup(majorRow * 3, majorCol * 3)))
	                    return false;
	        return true;
	    }
	
 	public boolean checkPuzzle() {
       return okRows() && okCols() && okSubgroups();
   }
   
   
   
//##################################################
//##################################################
//####	 CREATED THE MAIN METHOD BELOW TO   ########
//####   TEST THE CLASS AS WE CODE   ###############
//##################################################
//##################################################
	
	   	
	public static void main (String[] args)
	{		
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
		System.out.println("*********************************************************************");
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
		
		System.out.println(game.toString2());

		
	    System.out.println();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("NOTE:     TEST-PRINT OF okSingleRow method***********************************************************************");
		System.out.println("1) Takes 1st value in array and compares against each of the remaing values ");
		System.out.println("   in the specified row, then repeats for 2nd value in the row and so forth");
	    System.out.println();
		System.out.println("2) Each outer loop increment passes control to the inner loop for a complete");
		System.out.println("   set of iterations thru the inner loop index, and then pops back to outer loop"); 
	    System.out.println();
		System.out.println("3) Also, each outer loop increment decreases the range of the inner loop indexes remaining thru which to iterate");
		System.out.println("   by hooking into the inner loop's starting index value via variable assignment of the outer loop's index ");
		System.out.println("   to the inner loops index. Hences the inner loop iteration count decreases as the loops work together");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");

		boolean testOkSingleRow = game.okSingleRow(2);

	    System.out.println();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("NOTE:     TEST-PRINT OF okSingleCol method***********************************************************************");
		System.out.println("1) Takes 1st value in array and compares against each of the remaing values ");
		System.out.println("   in the specified col, then repeats for 2nd value in the col and so forth");
	    System.out.println();
		System.out.println("2) Each outer loop increment passes control to the inner loop for a complete");
		System.out.println("   set of iterations thru the inner loop index, and then pops back to outer loop"); 
	    System.out.println();
		System.out.println("3) Also, each outer loop increment decreases the range of the inner loop indexes remaining thru which to iterate");
		System.out.println("   by hooking into the inner loop's starting index value via variable assignment of the outer loop's index ");
		System.out.println("   to the inner loops index. Hences the inner loop iteration count decreases as the loops work together");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");

		boolean testOkSingleCol = game.okSingleCol(0);

		
		
	    System.out.println();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("NOTE:     TEST-PRINT OF getSingleSubgroup method*****************************************************************");
		System.out.println("CodeSummary: we are taking multiDimensional arrays and transforming them into a singleDimensional array.");
		System.out.println("1)  We are defining indexes via bracketed equations. left-hand side assigns to \"singleArray\" an index value ");
		System.out.println("    derived from an equation that has two parts, or two inputs added together: [oForIndexPCtrl * 3 + iForIndexRCtrl]");
		System.out.println();
		System.out.println("   PART1: oForIndexPCtrl * 3 is tied to the  outer loop and will result in (0 or 1 or 2) * 3 which equals 0 or 3 or 6 ");
		System.out.println("   PART2: iForIndexRCtrl is tied to the  inner loop and will result in 0 or 1 or 2.");
	    System.out.println();
	    System.out.println("Interestingly, the left side index value is generated/updated via the above two-part equation, but the value assigned to");
	    System.out.println("each of the 9 indexes is set by the right side of the assignment statement.");
	    System.out.println();
	    System.out.println("2) The right side of the equation is = board[row / 3 * 3 + oForIndexPCtrl][col / 3 * 3 + iForIndexRCtrl]");
		System.out.println("   Simplified w/ possible loopValues = board[(0 or 1 or 2) * 3 + (0 or 1 or 2)][(0 or 1 or 2) * 3 + (0 or 1 or 2)]"); 
		System.out.println("   SEE ITEM 3 for more details");
		System.out.println();
		System.out.println("3) Notice the patterns in the Output to the console, which shed light on the equations used on the right hand side: ");
		System.out.println("   i)   the args row and col result in one value each that remains the same thru all 9 loop iterations, or for ");
		System.out.println("		the whole subGroup array. IMPORTANTLY: this is due to int math, where the decimals are dropped/truncated.");
		System.out.println("		THUS TRANSITIONS to the next SUPER ROW/COL are at factors of 3.");
		System.out.println("   ii)  the outer loop values iterate by repeating the same index value the inner-loop index number of times, ");
		System.out.println("        repeating after each full cycle of the inner loop");
		System.out.println("   iii) the inner loop values iterate repeating in sequential pattern, repeating the pattern outer index number of times");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");

		
		
	    System.out.println();
		System.out.println("######################################################################################################");
		System.out.println("##### SUPER ROW 1 (Super Cols 1/2/3)##################################################################");
		System.out.println("#NOTE: int data type division truncates right of decimal, which enables us to get super rows and cols#");
		System.out.println("######################################################################################################");

		
	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 1 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[0][0]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test00GetSingleSubgroup = game.getSingleSubgroup(0, 0);

	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 2 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[1][4]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test11GetSingleSubgroup = game.getSingleSubgroup(1, 4);

		System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 3 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[2][8]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");
		
		int[] test22GetSingleSubgroup = game.getSingleSubgroup(2, 8);

	    System.out.println();
		System.out.println("######################################################################################################");
		System.out.println("##### SUPER ROW 2 (Super Cols 1/2/3)##################################################################");
		System.out.println("#NOTE: int data type division truncates right of decimal, which enables us to get super rows and cols#");
		System.out.println("######################################################################################################");
		
	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 4 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[3][2]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test33GetSingleSubgroup = game.getSingleSubgroup(3, 2);

		System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 5 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[4][3]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");
		
		int[] test44GetSingleSubgroup = game.getSingleSubgroup(4, 3);

	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 6 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[5][7]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test55GetSingleSubgroup = game.getSingleSubgroup(5, 7);

	    System.out.println();
		System.out.println("######################################################################################################");
		System.out.println("##### SUPER ROW 3 (Super Cols 1/2/3)##################################################################");
		System.out.println("#NOTE: int data type division truncates right of decimal, which enables us to get super rows and cols#");
		System.out.println("######################################################################################################");


	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 7 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[6][1]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test66GetSingleSubgroup = game.getSingleSubgroup(6, 1);

	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 8 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[7][5]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test77GetSingleSubgroup = game.getSingleSubgroup(7, 5);

	    System.out.println();
		System.out.println("**********************************************************************************************************************************************************");
		System.out.println("******************************************SUBGROUP 9 OF 9 (LEFT TO RIGHT AND TOP TO BOTTOM, THREE ACROSS AND THREE DOWN***********************************");
		System.out.println("******************************************NOTE: TEST-PRINT OF for board[row][col] args board[8][8]********************************************************");
		System.out.println("*************************************passed into board [row / 3 * 3 + (Outer Loop 0 or 1 or 2)][col / 3 * 3 + (Inner Loop 0 or 1 or 2)]*******************");
		System.out.println("**********************************************************************************************************************************************************");

		int[] test88GetSingleSubgroup = game.getSingleSubgroup(8, 8);
/*
	    System.out.println();
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");
		System.out.println("NOTE:     TEST-PRINT OF okSingleSubgroup method***********************************************************************");
		System.out.println("1) Different from okSingleRow and okSingleCol, the okSingleSubgroup method takes an array");
		System.out.println("   as the argument and then basically workd the same way as the other two methods");
	    System.out.println();
		System.out.println("2) Takes 1st value in array and compares against each of the remaing values, ");
		System.out.println("   then repeats for 2nd value in the array and so forth");
	    System.out.println();
	    System.out.println("3) Each outer loop increment passes control to the inner loop for a complete");
		System.out.println("   set of iterations thru the inner loop index, and then pops back to outer loop"); 
	    System.out.println();
		System.out.println("4) Also, each outer loop increment decreases the range of the inner loop indexes remaining thru which to iterate");
		System.out.println("   by hooking into the inner loop's starting index value via variable assignment of the outer loop's index ");
		System.out.println("   to the inner loops index. Hences the inner loop iteration count decreases as the loops work together");
		System.out.println("*****************************************************************************************************************");
		System.out.println("*****************************************************************************************************************");

		boolean testOkSingleSubgroup = game.okSingleSubgroup(game.getSingleSubgroup(0, 0));
*/		
		
	}
	
}
