class Solution {
    public int search(int[] nums, int target) {
        int smallest = 0;
        int bigest = nums.length-1;
        while(smallest<=bigest){
            int mid = smallest+(bigest-smallest)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) smallest = mid+1;
            else if(nums[mid]>target) bigest = mid-1;
        }
        return -1;
    }
}