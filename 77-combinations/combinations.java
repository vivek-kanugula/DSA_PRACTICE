class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> l = new ArrayList<>();
        set(n,k,1,new ArrayList<>(),l);
        return l;
    }

    public void set(int n,int k,int start,List<Integer> a,List<List<Integer>> l)
    {
        if(a.size() == k)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        for(int i=start;i<=n-(k-a.size())+1;i++)
        {
            a.add(i);
            set(n,k,i+1,a,l);
            a.remove(a.size()-1);
        }
        return;
    }
}