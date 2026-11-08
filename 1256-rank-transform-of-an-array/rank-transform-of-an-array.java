class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int r = 2, n = arr.length;
        if(n == 0)
            return new int[]{};
        if(n == 1)
            return new int[]{1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        hm.put(sorted[0],1);
        for(int i=1;i<arr.length;i++)
        {
            if(sorted[i] != sorted[i-1])
                hm.put(sorted[i],r++);
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = hm.get(arr[i]);
        return a;
    }
}