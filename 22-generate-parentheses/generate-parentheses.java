class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> l = new ArrayList<>();
        sum(n,0,0,"",l);
        return l;
    }
    public void sum(int n,int oc,int cc,String s,List<String> l)
    {
        if(oc == n && cc == n)
        {
            l.add(s);
            return;
        }
        if(oc < n)
            sum(n,oc+1,cc,s+"(",l);
        if(oc > cc)
            sum(n,oc,cc+1,s+")",l);
        return;
    }
}