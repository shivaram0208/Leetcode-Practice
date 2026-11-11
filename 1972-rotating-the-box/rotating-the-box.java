class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        char arr[][] = new char[boxGrid[0].length][boxGrid.length];
        for(int i = 0; i < boxGrid.length; i++)
        {
            ArrayList<Integer> list1 = new ArrayList<>(); // For '#'
            ArrayList<Integer> list2 = new ArrayList<>(); // For '.'
            for(int j = 0; j < boxGrid[i].length; j++)
            {
                if(boxGrid[i][j] == '#')
                    list1.add(j);
                else if(boxGrid[i][j] == '.')
                {
                    list2.add(j);
                }
                else if(boxGrid[i][j] == '*')
                {
                    for(int k = 0; k < list1.size() && !list2.isEmpty() && list1.get(k) < list2.get(list2.size() - 1); k++)
                    {
                        int idx = list1.get(k);
                        boxGrid[i][idx] = '.';
                        boxGrid[i][list2.get(list2.size() - 1)] = '#';
                        list2.remove(list2.size() - 1);
                    }
                    list1.clear();
                    list2.clear();
                }
            }
            for(int k = 0; k < list1.size() && !list2.isEmpty() && list1.get(k) < list2.get(list2.size() - 1); k++)
            {
                int idx = list1.get(k);
                boxGrid[i][idx] = '.';
                boxGrid[i][list2.get(list2.size() - 1)] = '#';
                list2.remove(list2.size() - 1);
            }
        }
        for(int i = 0; i < boxGrid.length; i++)
        {
            for(int j = 0; j < boxGrid[i].length; j++)
            {
                arr[j][boxGrid.length - 1 - i] = boxGrid[i][j];
            }
        }
        return arr;
    }
}