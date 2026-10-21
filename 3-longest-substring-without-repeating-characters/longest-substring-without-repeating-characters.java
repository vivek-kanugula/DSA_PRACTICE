class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] f = new int[256];
        Arrays.fill(f , -1);
        int l = 0 , r = 0 , max = 0 , n = s.length();
        while(r < n)
        {
            if(f[s.charAt(r)] != -1)
            {
                l = Math.max(l , f[s.charAt(r)]+1);
            } 
            f[s.charAt(r)] = r;
            if(l <= r)
            {
                max = Math.max(max , r-l+1);
            }
            r++;
        }
        return max;
    }
}