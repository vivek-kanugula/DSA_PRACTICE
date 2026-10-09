class Solution {
    public int countPrimes(int n) {
        
        if(n == 0 || n == 1 || n == 2)
            return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        int cnt = 0;
        for(int i=2;i*i<n;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    primes[j] = false;
                }
            }
        }

        for(int i=2;i<n;i++)
        {
            if(primes[i])
                cnt++;
        }
        return cnt;
    }
}