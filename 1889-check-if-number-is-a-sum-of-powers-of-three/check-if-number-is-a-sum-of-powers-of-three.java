class Solution {
    public boolean checkPowersOfThree(int n) {
        // 1 --> Math.pow(3, 0), 3 --> Math.pow(3, 1), 9 --> Math.pow(3, 3)
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