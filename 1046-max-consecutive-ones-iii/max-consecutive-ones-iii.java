class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i = 0 , j = 0 , max = 0 , n = nums.length;
        while(j < n)
        {
            if(nums[j] == 0)
            k--;
            while(k < 0)
            {
                if(nums[i] == 0)
                    k++;
                i++;
            }
            if(i <= j)
            max = Math.max(max , j-i+1);
            j++;
        }
        return max;
    }
}