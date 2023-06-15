//https://leetcode.com/problems/rotate-image/submissions/971577445/
class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        transpose(matrix, len);
        reflection(matrix, len);        
    }

    private void transpose(int[][] matrix, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void reflection(int[][] matrix, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = tmp;
            }
        }
    }
}
