class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> l = new ArrayList<>();
        if(digits == null || digits.isEmpty())
            return l;
        String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combo(digits , 0 , str,"",l);
        return l;
    }
    public void combo(String d,int i,String[] str,String s,List<String> l)
    {
        if(i == d.length())
        {
            l.add(s);
            return;
        }
        for(int ind = 0;ind<str[d.charAt(i)-'0'].length();ind++)
        {
            combo(d,i+1,str,s+str[d.charAt(i)-'0'].charAt(ind),l);
        }
        return;
    }
}