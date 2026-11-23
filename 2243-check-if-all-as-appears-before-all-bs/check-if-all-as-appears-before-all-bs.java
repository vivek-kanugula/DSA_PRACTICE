class Solution {
    public boolean checkString(String s) {
        int a = 1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'b' && a == 1)
                a = 0;
            else if(s.charAt(i) == 'a' && a == 0)
                return false;
        }
        return true;
    }
}