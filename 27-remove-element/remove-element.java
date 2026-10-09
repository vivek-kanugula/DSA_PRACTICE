class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length , i = 0 , j = 0;
        if(n == 0)
            return 0;
        while(i<n && j<n)
        {
            while(i<n && nums[i] != val)
                i++;
            if(i<j && nums[j]!=val)
            {
                nums[i] = nums[j];
                nums[j] = val;
                i++;
            }
            j++;
        }
        return i;
    }
}