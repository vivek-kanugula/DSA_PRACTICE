class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0)
            return 0;
        else if(n == 0)
            return 1;
        else if(n == 1)
            return x;
        double ans = 1;
        long nn = n;
        if(n < 0)
            nn = -nn;
        while(nn > 0)
        {
            if(nn%2 == 0)
            {
                x *= x;
                nn /= 2;
            }
            else
            {
                ans *= x;
                nn--;
            }
        }
        if(n <= 0)
            return 1.0/ans;
        return ans;
    }
}