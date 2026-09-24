class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low = 1 , high = nums[0];

        for(int i=1;i<nums.length;i++)
            high = Math.max(high,nums[i]);

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(isDivisorValid(nums , threshold , mid))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }

    public boolean isDivisorValid(int[] nums , int threshold , int divisor)
    {
        int sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i]/divisor;
            if(nums[i] % divisor != 0)
                sum++;
            if(threshold < sum)
                return false;
        }

        return sum <= threshold;
    }
}