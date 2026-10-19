class Solution {
    public int minGroups(int[][] intervals) {
        
        int cnt = 0 , i = 0 , j = 0 , n = intervals.length , max = 0;
        int[] dep = new int[n];
        Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
        for(int x=0;x<n;x++)
        {
            dep[x] = intervals[x][1];
        }
        Arrays.sort(dep);
        while(i < n)
        {
            if(intervals[i][0] <= dep[j])
            {
                i++;
                cnt++;
            }
            else
            {
                cnt--;
                j++;
            }
            max = Math.max(max,cnt);
        }

        return max;
    }
}