class Solution {
    public int singleNumber(int[] nums) {
        
        long ans = 0;
        for(int i=0;i<=31;i++)
        {
            int cnt = 0;
            for(int j=0;j<nums.length;j++)
            {
                if((((long)nums[j]>>i) & 1) != 0)
                    cnt++;
            }

            if(cnt %3 != 0)
                ans |= ((long)1<<i);
        }
        return (int)ans;
    }
}