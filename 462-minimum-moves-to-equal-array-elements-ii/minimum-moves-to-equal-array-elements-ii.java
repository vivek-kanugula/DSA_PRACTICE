class Solution {
    public int minMoves2(int[] nums) {
        
        int n = nums.length , total = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            total += Math.abs(nums[i]-nums[n/2]);
        }
        return total;
    }
}