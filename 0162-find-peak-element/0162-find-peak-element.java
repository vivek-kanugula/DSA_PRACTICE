class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1 || nums[0] > nums[1])
            return 0;
        if(nums[n-2] < nums[n-1])
            return n-1;
        int low = 1 , high = n-2;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid-1] < nums[mid] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid-1] <= nums[mid])
                low = mid+1;
            else 
                high = mid-1;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna