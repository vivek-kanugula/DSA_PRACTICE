class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> l = new ArrayList<>();
        per(s,"",0,l);
        return l;
    }
    public void per(String s,String a,int i,List<String> l)
    {
        if(i == s.length())
        {
            l.add(a);
            return;
        }

        if(!Character.isDigit(s.charAt(i)))
        {
            if(Character.isUpperCase(s.charAt(i)))
                per(s,a+Character.toLowerCase(s.charAt(i)),i+1,l);
            else
                per(s,a+Character.toUpperCase(s.charAt(i)),i+1,l);
        }
        per(s,a+s.charAt(i),i+1,l);
        return;
    }
}