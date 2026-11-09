class Solution {
    public void setZeroes(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++)
            arr[i] = matrix[i].clone();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(arr[i][j] == 0)
                {
                    for(int k = 0; k < matrix.length; k++) // Row
                        matrix[k][j] = 0;
                    for(int k = 0; k < matrix[0].length; k++) // Column
                        matrix[i][k] = 0;
                }
            }
        }
    }
}