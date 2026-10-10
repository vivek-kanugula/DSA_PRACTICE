class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String pre = strs[0];
        for(int i=0;i<pre.length();i++)
        {
            char current = pre.charAt(i);
            for(int word=1;word<strs.length;word++)
            {
                if(i >= strs[word].length() || strs[word].charAt(i) != current)
                    return pre.substring(0,i);
            }
        }
        return pre;
    }
}