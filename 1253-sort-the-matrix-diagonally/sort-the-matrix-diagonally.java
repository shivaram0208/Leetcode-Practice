class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int i = 0; i < n; i++)
        {
            int r = 0, c = i;
            ArrayList<Integer> list = new ArrayList<>();
            while(r < m && c < n)
            {
                list.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);
            r = 0;
            c = i;
            int idx = 0;
            while(r < m && c < n)
            {
                mat[r][c] = list.get(idx);
                idx++;
                r++;
                c++;
            }
        }
        for(int i = 1; i < m; i++)
        {
            int r = i, c = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while(r < m && c < n)
            {
                list.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);
            r = i;
            c = 0;
            int idx = 0;
            while(r < m && c < n)
            {
                mat[r][c] = list.get(idx);
                idx++;
                r++;
                c++;
            }
        }
        return mat;
    }
}