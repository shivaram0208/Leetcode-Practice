class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int f = 1, i = 0;
        int len = nums.length;
        for(int a = 2; a <= len; a++)
            f *= a;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int a : nums)
            list.get(0).add(a);
        while(list.size() < f && i < list.size())
        {
            for(int j = 0; j < list.get(i).size(); j++)
            {
                for(int k = j + 1; k < list.get(i).size(); k++)
                {
                    ArrayList<Integer> l = new ArrayList<>(list.get(i));
                    Collections.swap(l, j, k);
                    if(!list.contains(l))
                        list.add(l);
                }
            }
            i++;
        }
        return list;
    }
}