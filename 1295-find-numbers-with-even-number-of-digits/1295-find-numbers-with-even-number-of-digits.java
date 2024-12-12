class Solution {
    public int findNumbers(int[] nums) {
        int countdigits = 0;
        for(int i = 0; i<nums.length; i++){
            int countNumber = (int)Math.log10(nums[i])+1;
            if(countNumber%2==0){
                countdigits++;
            }
        }
        return countdigits;
    }
}