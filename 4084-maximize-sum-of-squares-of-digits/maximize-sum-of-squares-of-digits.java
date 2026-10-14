class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        StringBuilder sb = new StringBuilder();
        int i = 9 , no = 0;
        while(sum > 0)
        {
            int q = sum/i;
            sum = sum%i;
            if(q > 0)
            {
            no += q;
            sb.repeat(""+i+"",q);
            }
            if(no > num)
                return "";
            i--;
        }

        if(no > num)
            return "";
        if(no < num)
        {
            sb.repeat("0",num-no);
        }
        return sb.toString();
    }
}