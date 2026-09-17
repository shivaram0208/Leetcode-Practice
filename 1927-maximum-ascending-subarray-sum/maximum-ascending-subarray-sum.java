class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length - 1; i++)
        {
            int curr = nums[i];
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] > nums[j - 1])
                {
                    curr += nums[j];
                }
                else
                    break;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}