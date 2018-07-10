//solution version
public class SudokuPuzzle {
    private final int [][] board = new int[9][9];
    private final boolean [][] start = new boolean[9][9];	// true = not editable

    SudokuPuzzle () {
    }

    @Override
    public String toString() {
        String result = "";
        // the board array
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++)
                result += (board[row][col] != 0) ? board[row][col] + " " : "_ "; 
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

    public void addInitial(int row, int col, int value) {
        board[row][col] = value;
        start[row][col] = true;		// not editable
    }

    public void addGuess(int row, int col, int value) {
        if (!start[row][col] && getAllowedValues(row, col)[value - 1])
            board[row][col] = value;
    }

    public boolean checkPuzzle() {
        return okRows() && okCols() && okSubgroups();
    }

    private boolean okRows() {
        for (int row = 0; row < 9; row++)
            if (!okSingleRow(row))
                return false;
        return true;
    }

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