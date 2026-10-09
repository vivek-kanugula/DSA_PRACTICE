class Solution {
    public int minInsertions(String s) {
        
        int left = 0 , in = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                left++;
            }
            else
            {
               if(left > 0)
                    left--;
                else
                    in++;
                if(i<s.length()-1 && s.charAt(i+1) == ')')
                    i++;
                else
                    in++;
            }
        }
        in += left * 2;
        return in;
    }
}