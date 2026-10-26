class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length() , cnt = 0;
        int[] f = new int[3];
        Arrays.fill(f , -1);
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a'] = i;
            if(f[0] != -1 && f[1] != -1 && f[2] != -1)
            {
                cnt += (Math.min(f[0],Math.min(f[1],f[2]))+1);
            }
        }
        return cnt;
    }
}