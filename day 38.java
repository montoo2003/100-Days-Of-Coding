//https://leetcode.com/problems/transpose-matrix/submissions/969446796/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans[][]=new int[c][r];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
