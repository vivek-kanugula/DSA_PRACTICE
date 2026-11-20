class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        sum(nums,0,new ArrayList<>(),l);
        return l;
    }
    public void sum(int[] nums,int ind,List<Integer> a,List<List<Integer>> l)
    {
        
        l.add(new ArrayList<>(a));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i] == nums[i-1])
                continue;
            a.add(nums[i]);
            sum(nums,i+1,a,l);
            a.remove(a.size()-1);
        }
        return;
    }
}