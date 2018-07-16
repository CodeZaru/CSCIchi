
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
	//
//placeholder for checkPuzzle()
	//
	
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

	private boolean okSingleRow(int row) 
	{
		boolean result = false;
		for (int oForIndexPCtrl = 0;  oForIndexPCtrl < 9; oForIndexPCtrl++)
			for (int iForIndexRCtrl = oForIndexPCtrl+1; iForIndexRCtrl < 9; iForIndexRCtrl++)
				if ((board[row][oForIndexPCtrl] == board[row][iForIndexRCtrl]) && (board[row][oForIndexPCtrl] != 0))
				{
					System.out.println("okSingleRow Method (return false): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[row][oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[row][iForIndexRCtrl]);
					result = false;//return false;					
				}else {
					System.out.println("okSingleRow Method (return true): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[row][oForIndexPCtrl] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[row][iForIndexRCtrl]);
					result = true;//return true;
				}
		System.out.println("okSingleRow Final Result= " + result);
		return result;
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
	private boolean okSingleCol(int col)
	{
		boolean result = false;
		for (int oForIndexPCtrl = 0; oForIndexPCtrl < 9; oForIndexPCtrl++)
			for (int iForIndexRCtrl = oForIndexPCtrl+1; iForIndexRCtrl < 9; iForIndexRCtrl++)
				if((board[oForIndexPCtrl][col] == board[iForIndexRCtrl][col]) && (board[oForIndexPCtrl][col] != 0))
				{
					System.out.println("okSingleCol Method (return false): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[oForIndexPCtrl][col] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[iForIndexRCtrl][col]);
					result = false;
				} else {
					System.out.println("okSingleCol Method (return true): oForIndexPCtrl["+ oForIndexPCtrl +"] = " + board[oForIndexPCtrl][col] + " vs iForIndexRCtrl["+ iForIndexRCtrl +"] = " + board[iForIndexRCtrl][col]);
					result = true;
				}
		System.out.println("okSingleCol Final Result= " + result);
		return result;
	}
	
	//need to create from scratch later
    private int[] getSingleSubgroup(int row, int col) {
        int [] singleArray = new int[9];

        for (int oForIndexPCtrl = 0; oForIndexPCtrl < 3; oForIndexPCtrl++)
            for (int iForIndexRCtrl = 0; iForIndexRCtrl < 3; iForIndexRCtrl++) 
            {
                singleArray[oForIndexPCtrl * 3 + iForIndexRCtrl] = board[row / 3 * 3 + oForIndexPCtrl][col / 3 * 3 + iForIndexRCtrl];
				System.out.println("getSingleSubgroup Method (return array): singleArray[" + ((oForIndexPCtrl * 3)+iForIndexRCtrl) + "] is assigned board["+(row / 3 * 3)+ " + " + oForIndexPCtrl + " or " + ((row / 3 * 3) + oForIndexPCtrl) +"]["+(col / 3 * 3)+ " + " + iForIndexRCtrl + " or " + ((col / 3 * 3) + iForIndexRCtrl)  +"] = " + board[(row / 3 * 3) + oForIndexPCtrl][(col / 3 * 3) + iForIndexRCtrl]);
            }
        return singleArray;
    }
	
	
   public boolean[] getAllowedValues(int row, int col) 
   {
	return null;		   
   }
	
//##################################################
//##################################################
//#######CREATED THE MAIN METHOD BELOW TO###########
//#######TEST THE CLASS AS WE CODE##################
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
	        
	        game.addInitial(3, 0, 3);
	        game.addInitial(3, 4, 1);
	        
	        game.addInitial(4, 0, 2);        
	        
	        game.addInitial(5, 0, 9);
	        game.addInitial(5, 5, 5);
	        
	        game.addInitial(6, 0, 8);
	        
	        game.addInitial(7, 0, 7);
	        game.addInitial(8, 0, 5);        
	        game.addInitial(8, 3, 9); 
	 
		
		
		System.out.println(game.toString());//toString is lets us output objects visually 
		//if we comment out the toString method completely, then we see the objects class
		//and memory location
		System.out.println(game.toString2());
		
		boolean testOkSingleRow = game.okSingleRow(0);
//		System.out.println(testOkSingleRow);
		
		boolean testOkSingleCol = game.okSingleCol(0);
//		System.out.println(testOkSingleCol);
				
		int[] testGetSingleSubgroup = game.getSingleSubgroup(2, 3);
		System.out.println("######################################################################################################");
		int[] test2GetSingleSubgroup = game.getSingleSubgroup(0, 0);
		System.out.println("######################################################################################################");
		int[] test3GetSingleSubgroup = game.getSingleSubgroup(8, 8);

	
	}
	
}
