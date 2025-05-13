class Solution {
    public void moveZeroes(int[] nums) {
        //Move all the non-zero number to the front 
        int insertPos = 0;
        for(int i= 0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[insertPos]= nums[i];
                insertPos ++;
            }
        }
        // Fill remaining with 0 
        while(insertPos<nums.length){
            nums[insertPos] = 0;
            insertPos ++;
        }
    }
}