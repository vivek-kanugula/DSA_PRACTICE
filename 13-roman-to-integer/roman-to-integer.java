class Solution {
    public int romanToInt(String s) {
        
        int total = 0 , num = 0 , prev = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'I' : num = 1;
                            break;
                case 'V' : num = 5;
                            break;
                case 'X' : num = 10;
                            break;
                case 'L' : num = 50;
                            break;
                case 'C' :  num = 100;
                            break;
                case 'D' :  num = 500;
                            break;
                case 'M' : num = 1000;
            }

            if(prev == 0 || num >= prev)
                total += num;
            else
                total-=num;
            prev = num;
        }
        return total;
    }
}