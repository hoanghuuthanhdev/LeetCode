class Solution {
    // public int searchInsert(int[] nums, int target) {
      //Two-pointer overwrite
    //     if(nums.length ==0) return 0;
    //     int k= 0;
    //     for(int i= 0; i<nums.length; i++){
    //         if(nums[i]<target){
    //             k++;
    //         }
    //     }
    //     return k;
    // }
      public int searchInsert(int[] nums, int target) {
       //Binary Search
       int smallest = 0;
       int bigest = nums.length-1;
       while(smallest<=bigest){
        int mid = smallest+(bigest-smallest) /2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) smallest= mid+1;
        else if(nums[mid]>target) bigest = mid-1;
       }
       return smallest;
    }
}