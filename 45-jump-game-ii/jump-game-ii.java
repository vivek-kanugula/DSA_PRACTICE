class Solution {
    public int jump(int[] nums) {
        
        int l = 0 , r = 0 , jumps = 0 , far = 0 , n = nums.length;
        while(r < n-1)
        {
            far = 0;
            for(int ind = l; ind <= r;ind++)
            {
                far = Math.max(far , nums[ind]+ind);
            }
            l = r + 1;
            r = far;
            jumps++;
        }
        return jumps;
    }
}