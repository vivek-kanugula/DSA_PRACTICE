class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<(1<<n);i++)
        {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1) != 0)
                    l.add(nums[j]);
            }

            list.add(l);
        }
        return list;
    }
}