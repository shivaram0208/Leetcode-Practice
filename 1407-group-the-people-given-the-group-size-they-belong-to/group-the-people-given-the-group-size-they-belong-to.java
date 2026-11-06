class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++)
        {
            int val = groupSizes[i];
            if(!list.contains(val))
                list.add(val);
        }
        Collections.sort(list);
        int j = 0;
        for(int i = 0; i < list.size(); i++)
        {
            res.add(new ArrayList<>());
            int val = list.get(i);
            for(int k = 0; k < groupSizes.length; k++)
            {
                int idx = -1;
                if(groupSizes[k] == val)
                    idx = k;
                if(idx != -1)
                {
                    if(res.get(j).size() == val)
                    {
                        res.add(new ArrayList<>());
                        j++;
                    }
                    res.get(j).add(k);
                }          
            }
            j++;
        }
        return res;
    }
}