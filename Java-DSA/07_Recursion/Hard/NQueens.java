import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        
        System.out.println("Solutions for " + n + "-Queens:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        solve(0, board, result, n);
        return result;
    }
    
    private static void solve(int col, char[][] board, List<List<String>> result, int n) {
        if (col == n) {
            result.add(construct(board));
            return;
        }
        
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, board, result, n);
                board[row][col] = '.';
            }
        }
    }
    
    private static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }
        
        // Check upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        
        // Check lower diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }
        
        return true;
    }
    
    private static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}
