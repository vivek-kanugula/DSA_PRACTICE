class Solution {
    public int reversePairs(int[] arr) {
        
         return (int)mergesort(arr , 0 , arr.length-1);
    }
    
    public long mergesort(int[] arr,int low,int high)
    {
        long cnt = 0;
        if(low < high)
        {
            int mid = (high-low)/2 + low;
            cnt += mergesort(arr , low , mid);
            cnt += mergesort(arr , mid+1 , high);
            cnt += count(arr , low , mid , high);
            merge(arr , low , mid , high);
        }
        return (int)cnt;
    }

    public long count(int[] arr , int low , int mid , int high)
    {
        long cnt = 0 ;
        int j = mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(j <= high && 1L*arr[i] > 2L*arr[j])
                j++;
            cnt += (j-mid-1);
        }
        return cnt;
    }
    
    public void merge(int[] arr,int low,int mid,int high)
    {
        int  i = low , j = mid+1 ,k = 0;
        int[] temp = new int[high-low+1];
        
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }
        
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while(j <= high)
        {
            temp[k++] = arr[j++];
        }
        
        for(int x=low;x <= high;x++)
        {
            arr[x] = temp[x-low];
        }
    }
}