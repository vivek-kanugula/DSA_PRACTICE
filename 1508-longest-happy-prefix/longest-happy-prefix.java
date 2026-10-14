class Solution {
    public String longestPrefix(String s) {
        
        int n = s.length() , len = 0 , i = 1 ;
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

        if(lps[n-1] == 0)
            return "";
        return  s.substring(0,lps[n-1]);
    }
}