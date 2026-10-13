class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        HashSet<List<Integer>> hs = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<(1<<n);i++)
        {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1) != 0)
                    l.add(nums[j]);
            }

            hs.add(l);
        }
        return new ArrayList<>(hs);
    }
}