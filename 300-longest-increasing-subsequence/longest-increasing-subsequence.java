class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        for(int i = 1; i < n; i++) // First Element always be 1 
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[j] < nums[i])
                    arr[i] = Math.max(arr[i] , (1 + arr[j])); // Every element must be increase by 1 or 0
            }
        }
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
}