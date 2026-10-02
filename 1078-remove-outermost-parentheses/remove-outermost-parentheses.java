class Solution {
    public String removeOuterParentheses(String s) {
        
        int open = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                if(open != 0)
                    sb.append("(");
                open++;
            }
            else
            {
                if(open != 1)
                    sb.append(")");
                open--;
            }
        }
        return sb.toString();
    }
}