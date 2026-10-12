class Solution {
    public int minBitFlips(int start, int goal) {
        
        int xor = start^goal , cnt = 0;
        while(xor > 0)
        {
            xor = xor&(xor-1);
            cnt++;
        }
        return cnt;
    }
}