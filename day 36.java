//https://leetcode.com/problems/happy-number/submissions/967964405/
class Solution {
    public int nextNumber(int n){
        int newNumber = 0;
        while(n != 0){
            int num = n % 10;
            newNumber += num * num;
            n = n / 10;
        }
        return newNumber;
    }
    
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = nextNumber(n);
        }
        return n == 1;
    }
}
