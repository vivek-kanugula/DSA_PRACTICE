class Solution {
    public int strStr(String haystack, String needle) {
        
    int m = haystack.length() , n = needle.length() , len = 0 , i = 0, j = 0;
    if(n > m)
        return -1;
    int[] lps = computelps(needle);

    while(i<m)
    {
        if(needle.charAt(j) == haystack.charAt(i))
        {
            i++;
            j++;
        }
        else
        {
            if(j != 0)
                j = lps[j-1];
            else
                i++;
        }
        if(j == n)
            return i-j;
    }

    return -1;
  }

  public int[] computelps(String pat)
  {
    int n = pat.length() , len = 0 , i = 1;
    int[] lps = new int[n];
    lps[0] = 0;
    while(i<n)
    {
        if(pat.charAt(len) == pat.charAt(i))
        {
            len++;
            lps[i] = len;
            i++;
        }
        else
        {
            if(len != 0)
            {
                len = lps[len-1];
            }
            else
                i++;
        }
    }

    return lps;
  }
}