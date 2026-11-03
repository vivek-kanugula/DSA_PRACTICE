class Solution {
    public int minMoves(int[] nums) {
        
        int sum = 0 , max = 0 , n = nums.length;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            max = Math.max(max,nums[i]);
        }

        return max*n - sum;
    }
}