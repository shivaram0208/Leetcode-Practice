class Solution {
    public void gameOfLife(int[][] board) {
        int arr[][] = new int[board.length][board[0].length]; // It Used to check for each calculations
        for(int i = 0; i < board.length; i++)
            arr[i] = board[i].clone();
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                int count = 0;
                if(i >= 1 && arr[i - 1][j] == 1) // Top
                    count++;
                if(i >= 1 && j >= 1 && arr[i - 1][j - 1] == 1) // Top-Left
                    count++;
                if(i >= 1 && j < arr[i].length - 1 && arr[i - 1][j + 1] == 1) // Top-Right
                    count++;
                if(j >= 1 && arr[i][j - 1] == 1) // Left
                    count++;
                if(j < arr[i].length - 1 && arr[i][j + 1] == 1) // Right
                    count++;
                if(i < arr.length - 1 && arr[i + 1][j] == 1) // Bottom
                    count++;
                if(i < arr.length - 1 && j >= 1 && arr[i + 1][j - 1] == 1) // Bottom-Left
                    count++;
                if(i < arr.length - 1 && j < arr[i].length - 1 && arr[i + 1][j + 1] == 1) // Bottom-Right
                    count++;
                if(arr[i][j] == 1)
                {
                    if(count < 2 || count > 3)
                        board[i][j] = 0;
                }
                else
                {
                    if(count == 3)
                        board[i][j] = 1;
                }
            }
        }
    }
}