class Solution {
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length - 2; i++)
        {
            for(int j = 0; j < grid[0].length - 2; j++)
            {
                int val = func(grid, i, j);
                max = Math.max(max, val);
            }
        }
        return max;
    }
    public int func(int arr[][], int a, int b)
    {
        int sum = arr[a][b] + arr[a][b + 1] + arr[a][b + 2] + arr[a + 1][b + 1] + arr[a + 2][b] + arr[a + 2][b + 1] + arr[a + 2][b + 2];
        return sum;
    }
}