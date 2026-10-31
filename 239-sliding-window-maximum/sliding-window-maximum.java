class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] res = new int[n-k+1];
        ArrayDeque<Integer> a = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(!a.isEmpty() && a.peekFirst() <= i-k)
                a.pollFirst();
            while(!a.isEmpty() && nums[a.peekLast()] < nums[i])
                a.pollLast();
            a.addLast(i);
            if(i >= k-1)
                res[i-k+1] = nums[a.peekFirst()];
        }
        return res;
    }
}