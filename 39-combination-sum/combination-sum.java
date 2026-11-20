class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> l = new ArrayList<>();
        sum(candidates,target,0,0,new ArrayList<>(),l);
        return l;
    }
    public void sum(int[] c,int target,int sum,int i,List<Integer> a,List<List<Integer>> l)
    {
        if(sum == target)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        if(i == c.length || sum > target)   
            return;
        a.add(c[i]);
        sum(c,target,sum+c[i],i,a,l);
        a.remove(a.size()-1);
        sum(c,target,sum,i+1,a,l);
        return;
    }
}