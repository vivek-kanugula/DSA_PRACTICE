class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0)
            return 0;
        if(x == 1 || n == 0)
            return 1;
        double ans = 1;
        long nn = n;
        if(nn < 0)
            nn = -nn;
        while(nn > 0)
        {
            if(nn % 2 == 0)
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

        return n > 0 ? ans : 1.0/ans;
    }
}