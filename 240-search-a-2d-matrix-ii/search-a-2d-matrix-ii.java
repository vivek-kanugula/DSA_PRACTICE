class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length, n = matrix[0].length;
        int low = 0 , high = n-1;
        while(low < m && high >= 0)
        {
            if(matrix[low][high] == target)
                return true;
            else if(matrix[low][high] < target)
                low++;
            else
                high--;
        }
        return false;
    }
}