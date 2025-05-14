class Solution {
    //solution approach two loop O(n^2)
    // public boolean containsDuplicate(int[] nums) {
    //     boolean duplicates=false;
    //     int temp=0;
    //     while(temp<nums.length){
    //         for(int i = temp+1; i<nums.length; i++){
    //             if(nums[temp]==nums[i]) return duplicates= true;
    //         }
    //         temp++;
    //     }
    //     return duplicates;
    // }
    //solution approach sorted array compare the element adjacent 
    // public boolean containsDuplicate(int [] nums){
    //     Arrays.sort(nums);
    //     boolean duplicate = false;
    //     for(int i = 1; i<nums.length; i++){
    //         if(nums[i]==nums[i-1]) return duplicate = true;
    //     }
    //     return duplicate;
    // }
    //solution approach Hash Map
    public boolean containsDuplicate(int [] nums){
        boolean duplicate = false;
        HashMap<Integer, Integer> hash_map = new HashMap<>();
        for(int num: nums){
            if(hash_map.containsKey(num)){
                return duplicate = true;
            }
            hash_map.put(num,1);
        }
        return false;
    }
}