class Solution {
    public int maxProduct(int[] nums) {
        
        int pre = 1 , suf = 1 , max = Integer.MIN_VALUE , n = nums.length;
        for(int i=0;i<n;i++)
        {
            pre = pre*nums[i];
            suf = suf*nums[n-i-1];
            max = Math.max(max,Math.max(pre,suf));
            if(pre == 0)
                pre = 1;
            if(suf == 0)
                suf = 1;
        }
        return max;
    }
}