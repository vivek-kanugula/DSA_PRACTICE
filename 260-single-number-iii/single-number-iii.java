class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor = 0 , b1 = 0 , b2 = 0 , n = nums.length;
        for(int i=0;i<n;i++)
        {
            xor ^= nums[i];
        }

        int diffbit = (xor)&(~(xor-1));

        for(int i=0;i<n;i++)
        {
            if((diffbit & nums[i]) != 0)
                b1 ^= nums[i];
            else
                b2 ^= nums[i];
        }

        return new int[]{b1,b2};
    }
}