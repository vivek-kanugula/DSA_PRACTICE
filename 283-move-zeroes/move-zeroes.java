class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0 , j = 0 , n = nums.length;
        while(j < n && i < n){

            while(j < n && nums[j] != 0)
            {
                j++;
            }
            i = j+1;
            while(i < n && nums[i] == 0)
                i++;
            if(i < n)
            {
                nums[j] = nums[i];
                nums[i] = 0;
            }
        }
    }
}