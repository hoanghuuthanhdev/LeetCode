class Solution {
    public int missingNumber(int[] nums) {
        // number to find = sum index - sum array
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            n+=i-nums[i];
        }
        return n;
    }
}