class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        boolean hasZero = Arrays.stream(nums).anyMatch(x -> x == 0);
        if(!hasZero)
            return count;
        for(int i = 0; i <= nums.length - 3; i++)
        {
            if(nums[i] == 0)
            {
                // XOR Method:  0 ^ 1 = 1,    0 ^ 0 = 0,      1 ^ 1 = 0,       1 ^ 0 = 1
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }
        for(int i = nums.length - 2; i < nums.length; i++)
        {
            if(nums[i] == 0)
                return -1;
        }
        return count;
    }
}