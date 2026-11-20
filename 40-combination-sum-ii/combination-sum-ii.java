class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> l = new ArrayList<>();
        sum(candidates , target , 0,0,new ArrayList<>(),l);
        return l;
    }
    public void sum(int[] c,int target,int ind,int sum,List<Integer> a,List<List<Integer>> l)
    {
        if(sum == target)
        {
            l.add(new ArrayList<>(a));
            return;
        }

        if(ind == c.length)
            return;

        for(int i=ind;i<c.length;i++)
        {
            if(i>ind && c[i] == c[i-1])
                continue;
            if(sum+c[i] > target)
                break;
            a.add(c[i]);
            sum(c,target,i+1,sum+c[i],a,l);
            a.remove(a.size()-1);
        }
        return;
    }
}