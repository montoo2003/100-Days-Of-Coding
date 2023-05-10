class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int temp[]=new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                temp[j++]=nums[i];
            }

        }temp[j++]=nums[nums.length-1];
        for(int i=0; i<j; i++){
            nums[i]=temp[i];
        }
        return j;
    }
}
