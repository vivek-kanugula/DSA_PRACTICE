class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length , max = 0;
        for(int i=0;i<n;i++)
            hs.add(nums[i]);
        for(int num : hs)
        {
            int cnt = 1;
            int x = num;
            if(x == Integer.MIN_VALUE || !hs.contains(x-1))
            {
            while(x != Integer.MAX_VALUE && hs.contains(x+1))
            {
                cnt++;
                x++;
            }
            max = Math.max(cnt,max);
            }
        }
        return max;
    }
}