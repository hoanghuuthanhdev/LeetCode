class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    // from matrix to 1-dimensional array increasing 
    // index of array is calculated by the formula: idx=indexRow*lengthCol+indexCol
    // #(r,c)-->  (1,0) = idx = 1 * 4 + 0

    // quantity row, col in matrix  
        int row = matrix.length;
        int col = matrix[0].length;
        int smallest = 0;
        int bigest = row*col-1;
        while(smallest<=bigest){
            int mid = smallest+(bigest-smallest)/2;
    // find a mid position in the matrix
        int rowMid = mid/col;
        int colMid = mid%col;
        int midPosition = matrix[rowMid][colMid];
        if(midPosition == target){
            return true;
        }else if(midPosition < target){
            smallest = mid+1;
        }else{
            bigest= mid-1;
        }
        }
        return false;
    }
}