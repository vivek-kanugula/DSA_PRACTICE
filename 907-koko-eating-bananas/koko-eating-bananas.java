class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1 , high = piles[0];

        for(int i=0;i<piles.length;i++)
            high = Math.max(high , piles[i]);

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(isValid(piles , h , mid))
                high = mid-1;
            else
                low = mid+1;
        }

        return low;
    }

    public boolean isValid(int[] piles , int h , int mid)
    {
        long total = 0;
        for(int i=0;i<piles.length;i++)
        {
            total += piles[i]/mid;
            if(piles[i]%mid !=0)
                total++;
            if(total > h)
                return false;
        }

        return total <= h;
    }
}