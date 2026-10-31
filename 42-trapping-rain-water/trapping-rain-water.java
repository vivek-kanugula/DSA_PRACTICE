class Solution {
    public int trap(int[] height) {
        
        int n = height.length , total = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        if(n == 0 || n <= 2)
            return 0;
        left[0] = height[0];
        right[n-1] = height[n-1];
        for(int i=0;i<n;i++)
        {
            if(i > 0)
                left[i] = Math.max(height[i],left[i-1]);
            if(i < n-1)
                right[n-i-2] = Math.max(height[n-i-2],right[n-i-1]);
        }

        for(int i=1;i<n-1;i++)
        {
            total += Math.min(left[i],right[i])-height[i];
        }
        return total;
    }
}