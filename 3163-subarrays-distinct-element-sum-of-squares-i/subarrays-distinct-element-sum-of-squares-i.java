class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                hs.add(nums.get(j));
                int s = hs.size();
                sum += s*s;
            }
            hs.clear();
        }
        return sum;
    }
}