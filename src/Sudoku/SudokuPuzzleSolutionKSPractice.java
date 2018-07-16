public class SudokuPuzzleSolutionKSPractice {
    private final int [][] board = new int[9][9];//final makes it so that the board can't change.
    private final boolean [][] start = new boolean[9][9];// true = not editable

    SudokuPuzzleSolutionKSPractice () //constructor
    {
    }

    @Override
    public String toString() 
    {
   //KSNote: when writing a toString method, the point is to bundle it in a result that can be returned. 
        String result = "";//declare the return variable
        // the board array
        for (int row = 0; row < 9; row++) 
        {//nested loop; each row, perform iteration thru 9 cols applying inner loop's code
			for (int col = 0; col < 9; col++) {
				//result += (board[row][col] != 0) ? board[row][col] + " " : "_ ";
				//the commented out line above says: 
				//to set result according to the following logic
				//if value of specified cell not equal to 0, then append a space after the cell's value 
				//however, if it is equal to 0, then don't show the cell value
				//instead, show an underscore (essentially, in place of the zero) and then a space
				//Can be written as an if else stmt, as demonstrated below, but
				//the single line ternary approach is cleaner/better/more advanced and concise)
			 	if (board[row][col] != 0)  
			 		result += board[row][col] + " ";
			 	else
			 		result += "_ ";
			}
			//after executing the inner loop code, pop out and execute the outer loop line of code
			//which simply goes to the next row and calls the inner loop..
			result += "\n"; 
        }
        // the start array
//        for (int r = 0; r < 9; r++) {
//            for (int c = 0; c < 9; c++) 
//                result += start[r][c] ? "T " : "F "; 
//            result += "\n";
//        }

        return result;
    }

    public String toString2() 
    {
    	String result = "";
        // the start array
      for (int r = 0; r < 9; r++) {
          for (int c = 0; c < 9; c++) 
              result += start[r][c] ? "T " : "F "; 
          result += "\n";
      }
    	
    	return result;
    }
    
    public void addInitial(int row, int col, int value) {
        board[row][col] = value;
        start[row][col] = true;		// not editable
    }

    public void addGuess(int row, int col, int value) {
        if (!start[row][col] && getAllowedValues(row, col)[value - 1])
            board[row][col] = value;
    }
//Doesn't look like this method is being used in the test program with the current code state..
//need to look at the problem description and see how to put it to use
//basically just calls three methods and returns affirmative boolean if
//all three methods return affirmative 
    public boolean checkPuzzle() {
        return okRows() && okCols() && okSubgroups();
    }
//Doesn't look like this method is being used in the test program, but it is used in checkPuzzle().
//need to look at the problem description and see how to put it to use
//"okRows" method works in combination with "okSingleRow" method.
//"okRows" iterates through all the rows and calls the okSingleRow()
//and returns false if (!okSingleRow)
//looks like "okRows() was created as a final check..not a method run regularly..
    private boolean okRows() {
        for (int row = 0; row < 9; row++)
            if (!okSingleRow(row))
                return false;
        return true;
    }
//"okSingleRow(int row)" is an interesting "REPEAT TEST" type of nested loop in that it takes "row" as arg
//passes it thru three two nested for loops and into an "if" statement three layers deep
//and uses the row as the row index for the multiD sudoku array, hence board[row][]
//The loops are focused on the columns only, and outer index&value are each compared with all the inner indexes/values 
//the outer loop starts an index "i" at [0], and this is used as one col coordinate against which all the inner 
//column coordinates are compared as they are iterated thru, and then the code pops back out to the outer but next col 
//and back to inner loop, this is done all the way through each col of the outer loop (so what is the math for # of iterations that is..) 
//the inner loop starts an "relative" index "j" at [i+1], and will not iterate even 9 times the first round..
//Like the Sorting Interchange Algorithm's nested loops, each time the outer loop increments one, the inner loop
//index range is decreased so the next iteration is just of the remaining range of indexes (so 1stX = 8 iteration but 2ndX = only 7 then 6 and so forth..
//I'll change the naming convention to my "oForIndex" and "iForIndex" technique, but might add concept descriptor 
//regarding the index range incrementation results in decrementation.
//basically, the boolean test that is the if stmt in the inner loop is validates no repeats for the row and accounts for zeros.
    private boolean okSingleRow(int row) {
        for (int i = 0; i < 9; i++)
            for (int j = i + 1; j < 9; j++)
                if ((board[row][i] == board[row][j]) && (board[row][i] != 0))
                    return false;
        return true;
    }
    
    private boolean okCols() {
        for (int col = 0; col < 9; col++)
            if (!okSingleCol(col))
                return false;        
        return true;
    }

    private boolean okSingleCol(int col) {
        for (int i = 0; i < 9; i++)
            for (int j = i + 1; j < 9; j++)
                if ((board[i][col] == board[j][col]) && (board[j][col] != 0))
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
    
    private int[] getSingleSubgroup(int row, int col) {
        int [] singleArray = new int[9];

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                singleArray[r * 3 + c] = board[row / 3 * 3 + r][col / 3 * 3 + c];
        
        return singleArray;
    }

    private boolean okSingleSubgroup(int[] a) {
        for (int i = 0; i < 9; i++)
            for (int j = i + 1; j < 9; j++)
                if ((a[i] == a[j]) && (a[i] != 0))
                    return false;          
        return true;
    }
    
    public int getValueIn(int row, int col) {
        return board[row][col];
    }

    public boolean[] getAllowedValues(int row, int col) {
        boolean [] result = new boolean[9];
        int temp = getValueIn(row, col);

        for (int i = 0; i < 9; i++) {  // Tentatively placing 1-9 to the block 
            board[row][col] = i + 1;
            result[i] = okSingleRow(row) && okSingleCol(col) && okSingleSubgroup(getSingleSubgroup(row, col));
        }
        
        board[row][col] = temp;
        return  result;
    }

    public boolean isFull() {
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                if (board[row][col] == 0)
                    return false;
        return true;
    }

    public void reset() {
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                if (!start[row][col])
                    board[row][col] = 0;
    }

}