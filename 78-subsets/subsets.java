class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> l = new ArrayList<>();
        power(nums,0,nums.length ,l , new ArrayList<>());
        return l;
    }

    public void power(int[] nums,int ind,int n,List<List<Integer>> l,List<Integer> a)
    {
        if(ind == n)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[ind]);
        power(nums,ind+1,n,l,a);
        a.remove(a.size()-1);
        power(nums,ind+1,n,l,a);
    }
}