class Solution {
    public int myAtoi(String s) {
        
        long ans = 0;
        boolean sign = false;
        s = s.trim();
        int n = s.length() , i = 0;
        if(n == 0)
            return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+')
            {
                if(s.charAt(i) == '-')
                    sign = true;
                 i++;  
            }

        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int d = s.charAt(i)-'0';
            if(ans > (Integer.MAX_VALUE-d)/10)
                return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            ans = ans*10 + d;
            i++;
        }
        return sign ? -(int)ans : (int)ans;
    }
}