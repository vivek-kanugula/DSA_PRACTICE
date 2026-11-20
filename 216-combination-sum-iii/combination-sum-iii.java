class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> l = new ArrayList<>();
        sum(n,k,1,0,new ArrayList<>(),l);
        return l;
    }
    public void sum(int n,int k,int ind,int sum,List<Integer> a,List<List<Integer>> l)
    {
        if(k == 0 && sum == n)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        if(ind > 9 || sum > n || k < 0)
            return;
        a.add(ind);
        sum(n,k-1,ind+1,sum+ind,a,l);
        a.remove(a.size()-1);
        sum(n,k,ind+1,sum,a,l);
        return;
    }
}