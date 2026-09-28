class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]-(mid+1) < k)
                low = mid+1;
            else
                high = mid-1;
        }

        return k + high + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna