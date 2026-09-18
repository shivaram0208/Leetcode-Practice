class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n >= 3)
        {
            int rem = n % 3;
            if(rem == 2)
                return false;
            n /= 3;
        }
        return n != 2 && n != 0;
    }
}