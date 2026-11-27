class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        List<String> l = new ArrayList<>();
        HashSet<String> hs = new HashSet<>(wordDict);
        check(s,0,"",l,hs);
        return l;
    }
    public void check(String s,int start,String c,List<String> l,HashSet<String> hs)
    {
        if(start == s.length())
        {
            l.add(c.trim());
            return;
        }
        for(int end = start;end<s.length();end++)
        {
            String sub = s.substring(start,end+1);
            if(hs.contains(sub))
            {
                check(s,end+1,c+sub+" ",l,hs);
            }
        }
    }
}