/*
 * INTERVIEW QUESTIONS - Sudoku Solver (Backtracking):
 *
 * Q1: What is the Sudoku constraint?
 * A: Each row, column, and 3x3 box must contain digits 1-9 without repetition
 *
 * Q2: What algorithm is used to solve Sudoku?
 * A: Backtracking - try numbers 1-9, backtrack if invalid
 *
 * Q3: Time complexity of Sudoku solver?
 * A: O(9^(n*n)) worst case, but pruning makes it much faster
 *
 * Q4: How do we identify which 3x3 grid a cell belongs to?
 * A: (row/3)*3 and (col/3)*3 give top-left corner of the 3x3 grid
 *
 * Q5: What makes a placement "safe"?
 * A: Number doesn't exist in same row, column, or 3x3 grid
 *
 * Q6: What is backtracking?
 * A: Algorithmic technique that tries all possibilities and undoes invalid choices
 */
public class Solution {

    // Q: What are the three constraints checked here?
    // A: Row constraint, Column constraint, 3x3 grid constraint
    public static boolean isSafe(char[][] board, int row, int col, int number) {

        // Check row and column
        // Q: Why check both row and column in same loop? A: Optimization - both O(9)
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(number + '0')) {
                return false;  // Number exists in column
            }
            if (board[row][i] == (char)(number + '0')) {
                return false;  // Number exists in row
            }
        }

        // Q: How to find 3x3 grid starting position?
        // A: Integer division gives grid index, multiply by 3 for actual position
        int sr = (row / 3) * 3;  // Starting row of 3x3 grid
        int sc = (col / 3) * 3;  // Starting column of 3x3 grid

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) {
                    return false;  // Number exists in 3x3 grid
                }
            }
        }

        return true;
    }

    // Q: What is the backtracking approach here?
    // A: Try each valid number, recurse, undo if path doesn't lead to solution
    public static boolean solveSudoku(char[][] board, int row, int col) {

        // Q: Base case - when have we solved the puzzle?
        // A: When we've filled all 9 rows (row index reaches 9)
        if (row == 9) {
            return true;
        }

        // Move to next cell (left to right, top to bottom)
        int nextRow = row;
        int nextCol = col + 1;

        // Q: What happens at end of row? A: Move to next row, first column
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Q: What if cell is already filled? A: Skip to next cell
        if (board[row][col] != '.') {
            return solveSudoku(board, nextRow, nextCol);
        }

        // Try placing numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {

                board[row][col] = (char)(i + '0');  // Place number

                if (solveSudoku(board, nextRow, nextCol)) {
                    return true;  // Solution found
                }

                // Q: What is this? A: BACKTRACK - undo the choice
                board[row][col] = '.';
            }
        }

        return false;  // No valid number works for this cell
    }

    // Main function to solve Sudoku
    public static void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0);
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
        printBoard(board);
    }
}
