class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int m = mat.length , n = mat[0].length;
        if(m == 1 && n == 1)
            return new int[]{0,0};
        int low = 0 , high = n-1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int maxRowIndex = findMax(mat , mid , m);
            int left = mid-1 >= 0 ? mat[maxRowIndex][mid-1]: -1;
            int right = mid+1 < n ? mat[maxRowIndex][mid+1] : -1;

            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right)
                return new int[]{maxRowIndex , mid};
            else if(mat[maxRowIndex][mid] < left)
                high = mid-1;
            else
                low = mid+1;
        }

        return new int[]{-1,-1};
    }

    public int findMax(int[][] mat , int col , int m)
    {   
        int max = 0;
        for(int i=1;i<m;i++)
        {
            if(mat[i][col] > mat[max][col])
                max = i;
        }
        return max;
    }
}