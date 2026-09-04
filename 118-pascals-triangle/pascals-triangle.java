class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++)
        {
            list.add(new ArrayList<>());
            if(i <= 2)
            {
                for(int j = 1; j <= i; j++)
                {
                    list.get(i - 1).add(1);
                }
            }
            else
            {
                list.get(i - 1).add(1);
                int a = 0;
                for(int j = 1; j <= i - 2; j++)
                {
                    int val = list.get(i - 2).get(a) + list.get(i - 2).get(a + 1);
                    a++;
                    list.get(i - 1).add(val);
                }
                list.get(i - 1).add(1);
            }
        }
        return list;
    }
}