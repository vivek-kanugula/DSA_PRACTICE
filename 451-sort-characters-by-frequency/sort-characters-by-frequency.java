class Solution {
    public String frequencySort(String s) {
        
        int ind = 0;
        int[] fre = new int[128];
        char[]  res = s.toCharArray();

        for(int i=0;i<s.length();i++)
        {
            fre[s.charAt(i)]++;
        }

        while(ind < res.length)
        {
            int max = 0;
            for(int i=1;i<128;i++)
            {
                if(fre[i] > fre[max])
                {
                    max = i;
                }
            }

            while(fre[max]-- > 0)
            {
                res[ind++] = (char)max;
            }
        }

        return new String(res);
    }
}