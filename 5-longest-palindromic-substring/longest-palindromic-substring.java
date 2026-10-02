class Solution {
    public String longestPalindrome(String s) {
        
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            String s1 = even(s,i,s.length());
            if(ans.length() < s1.length())
                ans = s1;
            String s2 = odd(s,i,s.length());
            if(ans.length() < s2.length())
                ans = s2;
        }

        return ans;
    }

    public String even(String s,int start , int n)
    {
        int p1 = start , p2 = p1+1;
        while(p1 >=0 && p2 < n)
        {
            if(s.charAt(p1) == s.charAt(p2))
            {
                p1--;
                p2++;
            }
            else
                break;
        }
        return  s.substring(p1+1, p2);
    }

    public String odd(String s,int start , int n)
    {
        int p1 = start-1 , p2 = start+1;
        while(p1>=0 && p2<n)
        {
            if(s.charAt(p1) == s.charAt(p2))
            {
                p1--;
                p2++;
            }
            else
                break;
        }
        return s.substring(p1+1,p2);
    }
}