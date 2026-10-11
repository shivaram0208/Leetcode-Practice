class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0, n = nums.length;
        for(int i = 0; i < n; i++)
        {
            if(n % (i + 1) == 0) // In question, they provide as 1 indexed array. So, i declared from 1
            {
                ans += (nums[i] * nums[i]);
            }
        }
        return ans;
    }
}