class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        // Top Right Triangle
        for(int i = 1; i < n; i++)
        {
            int a = i;
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < n - i; j++)
            {
                list.add(grid[j][a]);
                a++;
            }
            Collections.sort(list);
            a = i;
            for(int j = 0; j < n - i; j++)
            {
                grid[j][a] = list.get(j);
                a++;
            }
        }
        // Bottom Left Triangle
        for(int i = 0; i < n; i++)
        {
            int a = i;
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < n - i; j++)
            {
                list.add(grid[a][j]);
                a++;
            }
            Collections.sort(list, Collections.reverseOrder());
            a = i;
            for(int j = 0; j < n - i; j++)
            {
                grid[a][j] = list.get(j);
                a++;
            }
        }
        return grid;
        
    }
}