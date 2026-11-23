class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> l = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        per(nums,new ArrayList<>(),used,l);
        return l;
    }
    public void per(int[] nums,ArrayList<Integer> a,boolean[] used,List<List<Integer>> l)
    {
        if(a.size() == nums.length)
        {
            l.add(new ArrayList<>(a));
            return;
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1]))
                continue;
            used[i] = true;
            a.add(nums[i]);
            per(nums,a,used,l);
            a.remove(a.size()-1);
            used[i] = false;
        }
    }
}