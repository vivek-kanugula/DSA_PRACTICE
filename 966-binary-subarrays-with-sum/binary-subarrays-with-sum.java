class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return find(nums , goal) - find(nums , goal-1);
    }
    public int find(int[] nums , int k)
    {
        int i = 0 , j = 0 , sum = 0 , cnt = 0;
        if(k < 0)
            return 0;
        while(j < nums.length)
        {
            sum += nums[j];
            while(i < nums.length && sum > k)
            {
                if(nums[i] == 1)
                    sum--;
                i++;
            }

            if(sum <= k)
                cnt += (j-i+1);
            j++;
        }

        return cnt;
    }
}