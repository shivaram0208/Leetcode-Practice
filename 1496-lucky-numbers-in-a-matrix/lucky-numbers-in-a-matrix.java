class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++)
        {
            boolean check = true;
            int val = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] < val)
                {
                    val = matrix[i][j];
                    idx = j;
                }
            }
            for(int k = 0; k < matrix.length && check; k++)
            {
                int a = matrix[k][idx];
                if(val < a && i != k)
                {
                    check = false;
                }
            }
            if(check)
                list.add(val);
        }
        return list;
    }
}