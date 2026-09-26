class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        if(m*k > n)
        return -1;
        int low = bloomDay[0] , high = bloomDay[0] , ans = -1;

        for(int i=1;i<n;i++)
        {
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]);
        }
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(isValid(bloomDay,m,k,mid))
            {
                high = mid-1;
                ans = mid;
            }
            else
                low = mid+1;
        }
        return ans;
    }

    public boolean isValid(int[] nums,int m,int k,int mid)
    {
        int cnt = 0 , total = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=mid)
                cnt++;
            else
                cnt = 0;
            if(cnt == k)
            {
                total++;
                cnt = 0;
            }
        }
        return total>=m;
    }
}