class Solution {
    public int totalFruit(int[] fruits) {
        
        int i = 0 , j = 0 , n = fruits.length , max = 0;
        HashMap<Integer,Integer> hm = new HashMap();
        while(j < n)
        {
            hm.put(fruits[j] , hm.getOrDefault(fruits[j],0)+1);
            if(hm.size() > 2)
            {
                hm.put(fruits[i] , hm.get(fruits[i])-1);
                if(hm.get(fruits[i]) == 0)
                    hm.remove(fruits[i]);
                i++;
            }
            if(hm.size() <= 2)
                max = Math.max(max , j-i+1);
            j++;
        }
        return max;
    }
}