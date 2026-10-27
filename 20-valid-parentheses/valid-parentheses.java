class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else{

                if(st.isEmpty())
                    return false;
                if((s.charAt(i) == ')' && st.peek() == '(') ||(c == ']' && st.peek() == '[') || (c == '}' && st.peek() == '{'))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}