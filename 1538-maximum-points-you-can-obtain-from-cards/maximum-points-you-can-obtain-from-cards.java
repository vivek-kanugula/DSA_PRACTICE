class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int max  = 0 , sum = 0 , n = cardPoints.length;
        for(int i=0;i<k;i++)
        {
            sum += cardPoints[i];
        }
        if(k == n)
            return sum;
        max = sum;
        for(int i = k-1;i>=0;i--)
        {
            sum -= cardPoints[i];
            sum += cardPoints[n-k+i];
            max = Math.max(max , sum);
        }
        return max;
    }
}