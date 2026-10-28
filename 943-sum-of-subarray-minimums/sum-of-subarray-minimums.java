class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007 ,n = arr.length;
        long ans = 0;
        int[] nse = findnse(arr);
        int[] pse = findpse(arr);

        for(int i=0;i<n;i++)
        {
            int left = i - pse[i];
            int right = nse[i] - i;
            ans  = (ans + (1L*left%mod*1L*right%mod)*1L*arr[i])%mod;
        }
        return (int)ans;
    }

    public int[] findnse(int[] arr)
    {
        int n = arr.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(n-1);
        for(int i=n-2;i >= 0;i--)
        {
            while(!ad.isEmpty() && arr[ad.peek()] >= arr[i])
                ad.pop();
            nse[i] = ad.isEmpty() ? n : ad.peek();
            ad.push(i);
        }
        return nse;
    }

    public int[] findpse(int[] arr)
    {
        int n = arr.length;
        int[] pse = new int[n];
        pse[0] = -1;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(0);
        for(int i=1;i < n;i++)
        {
            while(!ad.isEmpty() && arr[ad.peek()] > arr[i])
                ad.pop();
            pse[i] = ad.isEmpty() ? -1 : ad.peek();
            ad.push(i);
        }
        return pse;
    }
}