class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1) return x;
        int smallest = 1;
        int bigest = x;
        while(smallest<=bigest){
            int mid = smallest+(bigest- smallest)/2;
        if((long)mid *(long)mid>(long)x) bigest = mid-1;
        else if((long)mid * (long)mid==(long)x) return mid;
        else smallest = mid+1;
        }
        return Math.round(bigest);
    }
}