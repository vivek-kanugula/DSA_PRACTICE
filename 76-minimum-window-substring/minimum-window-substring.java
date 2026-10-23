class Solution {
    public String minWindow(String s, String t) {
        
        int i = 0 , j = 0, n = s.length() , min = 100000 ;
        String str = "";
        int[] sf = new int[58];
        int[] tf = new int[58];

        for(int x=0;x<t.length();x++)
            tf[t.charAt(x)-'A']++;
        while(j < n)
        {
            sf[s.charAt(j)-'A']++;
            while(check(sf , tf))
            {
                 if(min > j-i+1)
                 {
                    min = j-i+1;
                    str = s.substring(i,j+1);
                 }
                 sf[s.charAt(i)-'A']--;
                 i++;
            }
            j++;
        }
        return str;
    }

    public boolean check(int[] sf , int[] tf)
    {
        for(int i=0;i<58;i++)
        {
            if(tf[i] > sf[i])
                return false;
        }

         return true;
    }
   
}