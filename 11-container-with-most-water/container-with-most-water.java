class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length , total = 0;
        int l = 0 , r = n-1;
        while(l < r)
        {
            total = Math.max(total , Math.min(height[l],height[r])*(r-l));
            if(height[l] <= height[r])
                l++;
            else
                r--;
        }
        return total;
    }
}