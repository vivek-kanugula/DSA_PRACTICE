class Solution {
    public int[][] merge(int[][] intervals) {
        
        int ind = 0 , n = intervals.length;
        Arrays.sort(intervals , (a,b) ->
           Integer.compare(a[0] , b[0]));
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0] > intervals[ind][1])
            {
                ind++;
                intervals[ind] = intervals[i];
            }
            else
            {
                intervals[ind][1] = Math.max(intervals[ind][1] , intervals[i][1]);
            }
        }

        int[][] res = new int[ind+1][2];

        for(int i=0;i<=ind;i++)
        {
            res[i] = intervals[i];
        }
        return res;
    }
}