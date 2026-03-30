public class Solution {

    // Function to check if placing number is safe
    public static boolean isSafe(char[][] board, int row, int col, int number) {

        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(number + '0')) {
                return false;
            }
            if (board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    // Backtracking helper function
    public static boolean solveSudoku(char[][] board, int row, int col) {

        // If reached end of row
        if (row == 9) {
            return true;
        }

        // Move to next cell
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If cell already filled
        if (board[row][col] != '.') {
            return solveSudoku(board, nextRow, nextCol);
        }

        // Try placing numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {

                board[row][col] = (char)(i + '0');

                if (solveSudoku(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
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
