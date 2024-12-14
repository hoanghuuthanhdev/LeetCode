class Solution {
//     Solution 1
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
//     Solution 2
    public int findNumbers2(int[] nums){
        int countdigits = 0;
        for(int i = 0; i<nums.length; i++){
            int countPercent = 0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                countPercent++;
            }
            if(countPercent%2==0){
                countdigits++;
            }
        }
        return countdigits;
    }
}