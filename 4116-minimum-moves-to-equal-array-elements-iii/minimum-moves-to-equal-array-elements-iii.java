class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE, ans = 0;
        Arrays.sort(nums);
        max = nums[nums.length - 1];
        for(int i = 0; i < nums.length; i++)
        {
            ans += (max - nums[i]);
        }
        return ans;
    }
}