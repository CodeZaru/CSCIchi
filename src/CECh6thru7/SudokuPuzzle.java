
public class SudokuPuzzle {
	
	private int [][] board = new int [9][9];
	private boolean [][] start = new boolean[9][9];
//Can be solved with one or two/multidimensional array.
//	
//	private int[] board = new int [9];
// this basically allocates 9 bytes of memory in your RAM	
//row by column, so [0][8] is last cell of 1st row and [1][8] is the last cell of second row.
	
	SudokuPuzzle() {//SO NOTE THAT EVEN IF WE TAKE OUT THE ASTRIX SECTION, THE ARRAYS STILL PRINT
		//initialize to 0 the array, all rows in column 0
		//for(int row = 0; row < 9; row++)
		//	board [row][0] = 0;

		//when working w/ multi dimensional array you will often be working with nested loops. 
/*		for(int row = 0; row < 9; row++)
			//for row zero we populate all columns with the inner loop, then jump back to outer loop
			for (int col = 0; col < 9; col++) //{
			board [row][col] = 0;
			//start[row][col] = false;
			//}
*/
		}

	//use the toString method to overwrite the way we want it too (review how this refers to memory by default, 
	//but we can overwrite
	public String toString() {
		String result = "";
		//the  board array
		for (int r=0; r<9; r++) {
			for(int c=0; c<9; c++)
				//the space
				result += board[r][c] + " ";
			//if don't have this next line, it will be one big long string
			result += "\n";
		}
		//the start array
		for (int r=0; r<9; r++) {
			for (int c = 0; c<9; c++) {
				char ch = start[r][c] ? 'T' :'F';
				//result += start[r][c] + " ";
				result += ch + " ";
			}
			result +="\n";			
		}
		return result;
	
}

	//think of this as set initial
	//since we are going to populate the board from the main method we make this public, but if we were doing a more legit...
	public void addInitial(int row, int col, int value) {
	//	if (!start[row][col]) {
			board[row][col] = value;
			start[row][col] = true; //true = not editable  THIS IS A PARALLEL ARRAY THAT WE ARE SETTING FLAGS ON
	//	}	
}
	
	public void addGuess(int row, int col, int value) {
		if(!start[row][col])
			board[row][col] = value;
	}
	

	
	//checkPuzzle is likely Public b/c it is boolean: okRow, okColumn, okSubArray
	public boolean checkPuzzle() {
		
		return (okRows() && okCols() && okSubgroups());
	}
	
	private boolean okRows() {
		//finish your code here
		return true;
	}
	
	private boolean okCols() {
		//finish your code here
		return true;
	}
	
	private boolean okSubgroups() {
		//finish your code here  (this one will have subGroup)
		//I'll make temp arrays that subtract the cells and if any zeros then flag it and return the offenders  
		return true;
	}
	
	public int getValueIn(int row, int col) {
		return board[row][col];
	}

	public boolean [] getAllowedValues(int row, int col) {
		boolean [] result = new boolean[9];
//complete your code in here..which is updating the result--you try to add value and if it is ok then rowOk, colOk subGroupOk
//then you can populate--return boolean
		//you can add other methods but they have to be private! singleRowOk, singleColOk, and singleSubGroupOK
		//one loop and one if else, so you use the boolean and you print the numbers.
		return result; 
	}
	
	//says "is" then is a boolean convention
	public boolean isFull() {
		for (int r=0; r<9; r++) 
			for (int c = 0; c<9; c++) 
				if (board [r][c] == 0)
					return false;
				
			return true;
		}
	
	public void reset () {
		//the start array
		for (int r=0; r<9; r++) {
			for (int c = 0; c<9; c++) {
				if (start [r][c] == false) {
					board[r][c] = 0;		
				}
			}
		}
	}
	

	
	public static void main(String[] args) {
		SudokuPuzzle game = new SudokuPuzzle();
//remember that the .toString is implicit by default so you could just use 	System.out.println(game); instead of 	System.out.println(game.toString);
//default toString is w/o parameters, so if you have multiple toStings but some with parameters in the (), then the default is the one called implicitly	
//so if you comment out the toString method, it will give you the memory location
//if you change the name of toSting to toString1 or myPrint then if you call toString it will return memory, but if you call 
//your custom name it will return what you want..

		//System.out.println(game);
				
		game.addInitial(0,  0,  1);
		game.addInitial(0,  1,  2);
		game.addInitial(1,  1,  5);
		
		game.addGuess(2,  3,  1);
		game.addGuess(0,  0,  4);
		
		System.out.println(game);
		System.out.println(game.getValueIn(1,1));
	}
	
	//NOTES: make sure that you know HOW TO POPULATE VALUES INTO A TWO DIMENSIONAL ARRAY.
	
}