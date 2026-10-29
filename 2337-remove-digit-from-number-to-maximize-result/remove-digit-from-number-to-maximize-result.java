class Solution {
    public String removeDigit(String n, char d) {
        int cnt = 1 , ind = -1;
        StringBuilder s = new StringBuilder();
        s.append(n.charAt(0));
        for(int i=1;i<n.length();i++)
        {
            char c = n.charAt(i);
            char p = s.charAt(s.length()-1);
            if(s.length() == 0 ||( p != d ))
            {
                s.append(c);
            }
            else if( p == d && p < c)
            {
                s.deleteCharAt(s.length()-1);
                cnt--;
                ind = i;
                break;
            }
            else if(p == d && p >= c)
            {
                s.append(c);
            }
        }

        if(cnt == 0)
        {
            for(int i = ind;i<n.length();i++)
            {
                s.append(n.charAt(i));
            }
            return s.toString();
        }

        int i = s.length()-1;
        while(i >= 0 && cnt > 0)
        {
            if(s.charAt(i) == d)
            {
                s.deleteCharAt(i);
                cnt--;
            }
            i--;
        }
        return s.toString();
    }
}