class Solution {
    public boolean canAliceWin(int n) {
        int val = 10;
        int move = 0;
        while(val <= n)
        {
            n -= val;
            val--;
            move++;
        }
        return move % 2 == 1;
    }
}