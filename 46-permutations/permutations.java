class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> l = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        per(nums,new ArrayList<>(),used,l);
        return l;
    }
    public void per(int[] nums,List<Integer> a,boolean[] used,List<List<Integer>> l)
    {
        if(a.size() == nums.length)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        for(int ind = 0;ind<nums.length;ind++)
        {
            if(used[ind])
                continue;
            used[ind] = true;
            a.add(nums[ind]);
            per(nums,a,used,l);
            used[ind] = false;
            a.remove(a.size()-1);
        }
    }
}