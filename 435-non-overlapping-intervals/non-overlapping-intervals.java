class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int cnt = 0 , ind = 0;
        Arrays.sort(intervals , (a,b) ->{
            if(a[1] == b[1])
                return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] < intervals[ind][1])
            {
                cnt++;
            }
            else
            {
                ind = i;
            }
        }

        return cnt;
    }
}