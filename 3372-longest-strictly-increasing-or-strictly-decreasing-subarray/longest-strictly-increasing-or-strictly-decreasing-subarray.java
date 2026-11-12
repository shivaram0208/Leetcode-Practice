class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len1 = 0, len2 = 0;
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
            len1 = Math.max(len1, count1);
            len2 = Math.max(len2, count2);
        }
        return Math.max(len1, len2);
    }
}