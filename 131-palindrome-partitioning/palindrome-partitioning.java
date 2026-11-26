class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> l = new ArrayList<>();
        par(s,0,new ArrayList<>(),l);
        return l;
    }
    public void par(String s,int start,ArrayList<String> a,List<List<String>> l)
    {
        if(start == s.length())
        {
            l.add(new ArrayList<>(a));
            return;
        }

        for(int end = start;end<s.length();end++)
        {
            if(isvalid(s,start,end))
            {
                a.add(s.substring(start,end+1));
                par(s,end+1,a,l);
                a.remove(a.size()-1);
            }
        }
    }

    public  boolean isvalid(String s,int i,int j)
    {
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}