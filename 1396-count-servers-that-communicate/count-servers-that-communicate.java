class Solution {
    public int countServers(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1 && func(grid, i , j))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean func(int grid[][], int i, int j)
    {
        for(int k = 0; k < grid.length; k++) // For Row
        {
            if(i == k)
                continue;
            if(grid[k][j] == 1)
                return true;
        }
        for(int k = 0; k < grid[i].length; k++) // For Column
        {
            if(j == k)
                continue;
            if(grid[i][k] == 1)
                return true;
        }
        return false;
    }
}