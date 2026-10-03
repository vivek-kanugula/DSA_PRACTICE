class Solution {
    public int beautySum(String s) {
        
        int total = 0;
        for(int i=0;i<s.length();i++)
        {
            int[] ch = new int[26];
            for(int j=i;j<s.length();j++)
            {
            int max = 0 , min = 501;
            ch[s.charAt(j)-'a']++;
            for(int k = 0;k<26;k++)
            {
                if(ch[k]>0)
                {
                max = Math.max(max,ch[k]);
                min = Math.min(min,ch[k]);
               }
            }
            total += max-min;
            }        
        }
        return total;
    }
}