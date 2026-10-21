class Solution {
    public long maxAlternatingSum(int[] nums) {
        // Sort primitive int array by absolute value
        nums = java.util.Arrays.stream(nums)
                    .boxed()
                    .sorted((a, b) -> Integer.compare(Math.abs(a), Math.abs(b)))
                    .mapToInt(i -> i)
                    .toArray();
        long sum = 0;
        int i = 0, j = nums.length - 1;
        boolean add = true;
        while(i <= j)
        {
            if(add)
            {
                sum += (long)(nums[j] * nums[j]);
                j--;
            }
            else
            {
                sum -= (long)(nums[i] * nums[i]);
                i++;
            }
            if(add)
                add = false;
            else
                add = true;
        }
        return sum;
    }
}