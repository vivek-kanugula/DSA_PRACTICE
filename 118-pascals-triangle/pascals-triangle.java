class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            find(i,l);
        }
        return l;
    }

    public void find(int n,List<List<Integer>> l)
    {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i == 0 || i == n-1)
            {
                a.add(1);
            }
            else
            {
                a.add(l.get(l.size()-1).get(i-1)+l.get(l.size()-1).get(i));
            }
        }
        l.add(a);
    }
}