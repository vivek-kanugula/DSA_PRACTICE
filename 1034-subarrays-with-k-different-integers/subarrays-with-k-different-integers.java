class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return find(nums , k) - find(nums , k-1);
    }

    public int find(int[] nums , int k)
    {
        if(k < 0)
            return 0;
        int i = 0 , j = 0 , n = nums.length , cnt = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        while(j < nums.length)
        {
            hm.put(nums[j] , hm.getOrDefault(nums[j] , 0)+1);
            while(i < nums.length && hm.size() > k)
            {
                if(hm.get(nums[i]) == 1)
                    hm.remove(nums[i]);
                else
                    hm.put(nums[i] , hm.get(nums[i])-1);
                i++;
            } 

            if(hm.size() <= k)
                cnt += j-i+1 ;
            j++; 
        }
        return cnt;
    }
}