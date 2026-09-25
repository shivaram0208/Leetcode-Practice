class Solution {
    public int countKDifference(int[] nums, int k) {
        int i = 0, j = 1;
        int count = 0;
        while(i < nums.length)
        {
            while(j < nums.length)
            {
                if(Math.abs(nums[i] - nums[j]) == k)
                    count++;
                j++;
            }
            i++;
            j = i + 1;
        }
        return count;
    }
}