class Solution {
    public String shortestPalindrome(String s) {
        
        if(s.length() <= 1)
            return s;
        String rev = new StringBuilder(s).reverse().toString();
        String com = s+"#"+rev;
        int[] lps = build(com);
        String rem = new StringBuilder(s.substring(lps[lps.length-1])).reverse().toString();
        return rem+s;
    }

    public int[] build(String s)
    {
        int n = s.length() , len = 0 , i = 1;
        int[] lps = new int[n];
        while(i<n)
        {
            if(s.charAt(i) == s.charAt(len))
            {
                lps[i] = ++len;
                i++;
            }
            else
            {
                if(len != 0)
                {
                    len = lps[len-1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}