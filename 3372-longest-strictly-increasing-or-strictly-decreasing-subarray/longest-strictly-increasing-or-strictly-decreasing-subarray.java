class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int prev1 = nums[i], prev2 = nums[i];
            int count1 = 1, count2 = 1;
            for(int j = i + 1; j < nums.length; j++) 
            {
                if(nums[j] > prev1)
                {
                    prev1 = nums[j];
                    count1++;
                }
                else
                    break;
            }
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] < prev2)
                {
                    prev2 = nums[j];
                    count2++;
                }
                else
                    break;
            }
            max = Math.max(max, Math.max(count1, count2));
        }
        return max;
    }
}