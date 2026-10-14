class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length() , len = 0 , i = 1;
        int[] lps = new int[n];

        while(i<n)
        {
            if(s.charAt(len) == s.charAt(i))
            {
                lps[i] = ++len;
                i++;
            }
            else
            {
                if(len != 0)
                    len = lps[len-1];
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n-1] > 0 && n % (n-lps[n-1]) == 0;
    }
}