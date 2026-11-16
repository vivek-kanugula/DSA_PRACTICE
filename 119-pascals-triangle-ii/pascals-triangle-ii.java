class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> l = new ArrayList<>();        
        long prev = 1;
        for(int i=0;i<=rowIndex;i++)
        {
            l.add((int)prev);
            prev = prev*(rowIndex-i)/(i+1);
        }
        return l;
    }
}