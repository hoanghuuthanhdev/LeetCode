class Solution {
    // Solution1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
          
    }
    // // Solution2
    // public void merge2(int[] nums1, int m, int[] nums2, int n){

    // }

    
}