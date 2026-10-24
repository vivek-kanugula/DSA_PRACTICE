class Solution {
    public String minWindow(String s, String t) {

        int i = 0, j = 0, n = s.length(), m = t.length(), min = 100000, cnt = 0 , target = 0;
        String str = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int x = 0; x < m; x++)
            hm.put(t.charAt(x), hm.getOrDefault(t.charAt(x), 0) + 1);
        target = hm.size();
        while (j < n) {
            hm.put(s.charAt(j) , hm.getOrDefault(s.charAt(j),0)-1);
            if(hm.get(s.charAt(j)) == 0)
                cnt++;
            while(cnt == target){
                if((j-i+1) < min){
                    min = j-i+1;
                    str = s.substring(i,j+1);
                }
                hm.put(s.charAt(i) , hm.get(s.charAt(i))+1);
                if(hm.get(s.charAt(i)) > 0)
                    cnt--;
                i++;
            }
            j++;
        }
        return str;
    }

}