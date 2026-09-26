class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length >= 3)
        {
            Arrays.sort(nums);
            return nums[1];
        }
        return -1;
    }
}