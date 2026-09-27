class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = weights[0] , high = weights[0];
        for(int i=1;i<weights.length;i++)
        {
            high += weights[i];
            low = Math.max(low , weights[i]);
        }

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(isValid(weights , days , mid))
                high = mid-1;
            else
                low = mid+1;
        }

        return low;
    }

    public boolean isValid(int[] weights , int days , int mid)
    {
        int total = 0 , sum = 0;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i] <= mid)
            {
                sum += weights[i];
            }
            else
            {
                total++;
                sum = weights[i];
            }

            if(total > days)
                return false;
        }

        return ++total <= days;
    }
}