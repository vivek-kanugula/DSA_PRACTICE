class Solution {
    public int characterReplacement(String s, int k) {
        
        int i = 0 , j = 0 , n = s.length() , maxf = 0 , max = 0;
        int[] f = new int[26];

        while(j < n)
        {
            f[s.charAt(j)-'A']++;
            maxf = Math.max(maxf , f[s.charAt(j)-'A']);
            if((j-i+1) - maxf > k)
            {
                f[s.charAt(i)-'A']--;
                i++;
            }

            if((j-i+1) - maxf <= k)
                max = Math.max(max , j-i+1);
            j++;
        }
        return max;
    }
}