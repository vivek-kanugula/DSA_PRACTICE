class Solution {
    public int splitArray(int[] nums, int k) {
        
        long low = nums[0] , high = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            low = Math.max(low,nums[i]);
            high += nums[i];
        }

        while(low <= high)
        {
            long mid = low + (high-low)/2;
            if(isValid(nums , k , mid))
                high = mid-1;
            else
                low = mid+1; 
        }

        return (int)low;
    }

    public boolean isValid(int[] nums,int k,long mid)
    {
        long sum = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum + nums[i] <= mid)
            {
                sum+= nums[i];
            }
            else
            {
                cnt++;
                sum = nums[i];
            }

            if(cnt > k)
                return false;
        }
        return ++cnt <= k;
    }
}