class Solution {
  public int numRabbits(int[] answers) {
    int max = 0; 
    int freq[] = new int [1001];
    for( int r : answers){
      if( r == 0)max++;
      else if( freq[r] > 0 && freq[r] == r) freq[r] = 0;
      else if( freq[r] == 0) { max += r+1; freq[r]++; }
      else freq[r]++;
    }
    return max;
  }
}
