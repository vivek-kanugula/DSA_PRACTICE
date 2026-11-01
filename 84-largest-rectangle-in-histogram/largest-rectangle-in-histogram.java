class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int total = 0 , n = heights.length;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!ad.isEmpty() && heights[ad.peek()] > heights[i])
            {
                int ind = ad.pop();
                int nse =  i;
                int pse = ad.isEmpty() ? -1 : ad.peek();
                total = Math.max(total , (nse-pse-1)*heights[ind]);
            }
            ad.push(i);
        }

        while(!ad.isEmpty())
        {
            int nse = n;
            int ind = ad.pop();
            int pse = ad.isEmpty() ? -1 : ad.peek();
            total = Math.max(total , (nse-pse-1)*heights[ind]);
        }
        return total;
    }
}