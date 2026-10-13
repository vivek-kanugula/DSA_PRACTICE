class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        int n = s.length();
        int l = n-1 , r = n-1;
        StringBuilder sb = new StringBuilder();
        while(r>=0 && l>=0)
        {
            while(r >= 0 && s.charAt(r) == ' ')
                r--;
            l = r-1;
            while(l >= 0 && s.charAt(l) != ' ')
                l--;
            if(l+1 >= 0 && r >= 0)
            {
                sb.append(s.substring(l+1,r+1));
                if(l != -1)
                    sb.append(" ");
                r = l-1;
            }
        }
        return sb.toString();
    }
}