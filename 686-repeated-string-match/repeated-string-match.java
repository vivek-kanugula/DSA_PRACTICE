class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        int m = a.length() , n = b.length() , cnt = 1;
        long pow = 1 , d = 31 , winhash = 0 , pathash = 0 , mod = 1000000007;
        StringBuilder sb = new StringBuilder(a);
        while(sb.length() < b.length())
        {
            sb.append(a);
            cnt++;
        }

        for(int i=0;i<n-1;i++)
            pow = (pow%mod*d%mod)%mod;
        for(int i=0;i<n;i++)
        {
            pathash = (pathash*d%mod  + b.charAt(i))%mod;
            winhash = (winhash*d%mod + sb.charAt(i))%mod;
        }

        if(rabin(sb,b,pow,d,pathash,winhash))
            return cnt;
        sb.append(a);
        if(rabin(sb,b,pow,d,pathash,winhash))
            return cnt+1;
        return -1;

    }

    public boolean rabin(StringBuilder a, String b , long pow , long d , long pathash , long winhash)
    {
        int m = a.length() , n = b.length();
        long mod = 1000000007;
        for(int i=0;i<=m-n;i++)
        {
            if(pathash == winhash)
            {
                int j = 0;
                while(j<n && a.charAt(j+i) == b.charAt(j))
                {
                    j++;
                }
                if(j == n)
                    return true;
            }

            if(i < m-n)
            {

                 winhash = ((winhash-a.charAt(i)*pow%mod + mod)*d + a.charAt(i+n))%mod;
            }

            if(winhash < 0)
            {
                winhash += mod;
            }
        }
        
        return false;
    }
}