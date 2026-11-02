class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int m = matrix.length , n = matrix[0].length , area = 0;
        int[][] pre = new int[m][n];
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                sum += matrix[j][i]-'0';
                if(matrix[j][i] == '0')
                {
                    pre[j][i] = 0;
                    sum = 0;
                }
                else
                    pre[j][i] = sum;
            }
        }
        for(int i=0;i<m;i++)
        {
            area = Math.max(area , hist(pre[i]));
        }
        return area;
    }

    public int hist(int[] nums)
    {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        int n = nums.length , max = 0 , nse = n , pse = -1 , ind = -1;
        for(int i=0;i<n;i++)
        {
             while(!a.isEmpty() && nums[a.peek()] > nums[i])
             {
                nse = i;
                ind = a.pop();
                pse = a.isEmpty() ? -1 : a.peek();
                max = Math.max(max , (nse-pse-1)*nums[ind]);
             }
            a.push(i);
        }

        while(!a.isEmpty())
        {
            nse = n;
            ind = a.pop();
            pse = a.isEmpty() ? -1 : a.peek();
            max = Math.max(max , (nse-pse-1)*nums[ind]);
        }
        return max;
    }
}