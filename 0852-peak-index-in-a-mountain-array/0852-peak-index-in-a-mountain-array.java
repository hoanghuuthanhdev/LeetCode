class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int smallest = 0;
        int bigest = arr.length-1;
        while(smallest<bigest){
            int mid = smallest+(bigest-smallest)/2;
            if(arr[mid]>arr[mid+1]) bigest = mid;
            else if(arr[mid]<arr[mid+1]) smallest = mid+1;
        }
        return smallest;   
    }
}