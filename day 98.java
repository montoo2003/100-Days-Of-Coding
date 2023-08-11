class Solution {
    public int findMin(int[] n) {
    int min = Integer.MAX_VALUE;

    for(int i=0;i<n.length;i++){
        min =Math.min(min,n[i]);
    }
    return min;
        
    }
}
