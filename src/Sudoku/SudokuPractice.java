
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
	public void addInitial(int row, int col, int value)
	{
		board[row][col] = value;
		start[row][col] = true; //not editable
	}
		
	public static void main (String[] args)
	{
		SudokuPractice game = new SudokuPractice();
		System.out.println(game.toString());//toString is lets us output objects visually 
		//if we comment out the toString method completely, then we see the objects class
		//and memory location
		  
	}
	
}
