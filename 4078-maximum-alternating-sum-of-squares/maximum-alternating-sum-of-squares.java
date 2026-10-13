class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        int n = nums.length;
        long sum = 0;
        if(n == 1)
            return (long)nums[0]*nums[0];
        for(int i=0;i<n;i++)
            nums[i] *= nums[i];
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++)
        {
            sum += (nums[n-i-1]);
            sum -= (nums[i]);
        }

        if(n%2 != 0)
            sum += nums[n/2];
        return sum;
    }
}