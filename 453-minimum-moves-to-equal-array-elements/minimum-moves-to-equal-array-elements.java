class Solution {
    public int minMoves(int[] nums) {
        
        int cnt = 0 , n = nums.length , min = nums[0];
        for(int i=1;i<n;i++)
        {
            min = Math.min(min,nums[i]);
        }

        for(int i=0;i<n;i++)
        {
            cnt += nums[i]-min;
        }
        return cnt;
    }
}