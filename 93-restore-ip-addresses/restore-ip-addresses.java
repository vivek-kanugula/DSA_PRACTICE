class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> l = new ArrayList<>();
        if(s.length() < 4 || s.length() > 12)
            return l;
        ip(s,0,new ArrayList<>(),l);
        return l;
    }
    public void ip(String s,int start,List<String> c,List<String> l)
    {
        if(c.size() == 4)
        {
            if(start == s.length())
                l.add(String.join(".",c));
            return;
        }
        for(int end = start;end < Math.min(start+3,s.length());end++)
        {
            String seg = s.substring(start,end+1);
            if(valid(seg))
            {
                c.add(seg);
                ip(s,end+1,c,l);
                c.remove(c.size()-1);
            }
        }
    }
    public boolean valid(String s){
        if((s.length()>1 && s.charAt(0) == '0'))
            return false;
        return Integer.parseInt(s) <= 255;
    }
}