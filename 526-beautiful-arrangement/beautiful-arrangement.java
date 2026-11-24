class Solution {
    public int countArrangement(int n) {
        
        boolean[] used = new boolean[n+1];
        return backtrack(1,n,used);
    }

    public int backtrack(int pos,int n,boolean[] used)
    {
        if(pos > n)
        {
            return 1;
        }
        int cnt = 0;
        for(int i = 1;i<=n;i++)
        {
            if(used[i] || (pos % i != 0 && i % pos != 0))
                continue;
            used[i] = true;
            cnt += backtrack(pos+1,n,used);
            used[i] = false;
        }
        return cnt;
    }
}