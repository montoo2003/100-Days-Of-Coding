//https://leetcode.com/problems/sudoku-solver/submissions/973789907/
class Solution {
    public void solveSudoku(char[][] board) {
        // Start solving sudoku from the first cell
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        // Base case: If row is equal to board length, entire board has been filled
        if (row == board.length) {
            return true;
        }
        
        // Move to next row when current row is fully filled
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        
        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        
        // Try different numbers in current cell
        for (char num = '1'; num <= '9'; num++) {
            if (isValidPlacement(board, row, col, num)) {
                board[row][col] = num; // Fill current cell with valid number
                
                // Move to next cell
                if (solve(board, row, col + 1)) {
                    return true;
                }
                
                // Backtrack to previous state if solution not found
                board[row][col] = '.';
            }
        }
        
        // No valid solution found
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        
        for (int i = 0; i < board.length; i++) {
            
            if (board[i][col] == num) {
                return false;
            }

            
            if (board[row][i] == num) {
                return false;
            }
 
            
            int subgridRow = 3 * (row / 3) + i / 3; 
            int subgridCol = 3 * (col / 3) + i % 3; 
 
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }
        return true;
    }
}
