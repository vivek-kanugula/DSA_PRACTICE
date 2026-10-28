class Solution {
    public String removeKdigits(String num, int k) {
        
        int n = num.length();
        StringBuilder s = new StringBuilder();
        s.append(num.charAt(0));
        for(int i=1;i<n;i++)
        {
            char c = num.charAt(i);
            while(k > 0 && s.length() > 0 && s.charAt(s.length()-1) > c)
            {
                s.deleteCharAt(s.length()-1);
                k--;
            }
            s.append(c);
        }

        while(k > 0 && s.length() > 0)
        {
            s.deleteCharAt(s.length()-1);
            k--;
        }

        while(s.length() > 0 && s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }

        if(s.length() == 0)
            return "0";
        return s.toString();
    }
}