class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            find(i,l);
        }
        return l;
    }

    public void find(int n,List<List<Integer>> l)
    {
        List<Integer> a = new ArrayList<>();
        int ans = 1 ;
        for(int i=0;i<=n;i++)
        {
            a.add(ans);
            ans = ans*(n-i)/(i+1);
        }
        l.add(a);
    }
}