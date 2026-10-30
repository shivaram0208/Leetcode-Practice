class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = (nums.length + 1) / 2;
        while(i < nums.length && j < nums.length)
        {
            if(2 * nums[i] <= nums[j])
            {
                i++;
                j++;
                count++;
            }
            else
                j++;
        }
        return 2 * count;
    }
}