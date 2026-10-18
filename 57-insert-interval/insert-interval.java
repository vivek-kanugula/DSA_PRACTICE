class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> l = new ArrayList<>();
        int i = 0 , n = intervals.length;
        while(i < n && intervals[i][1] < newInterval[0])
        {
            l.add(intervals[i]);
            i++;
        }

        while(i < n && intervals[i][0] <= newInterval[1])
        {
            newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
            i++;
        }
        l.add(newInterval);
        while(i < n)
        {
            l.add(intervals[i]);
            i++;
        }
        return l.toArray(new int[0][0]);
    }
}