class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int a : nums)
        {
            if(a % 2 == 0)
            {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }
        int res = -1, pre_val = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            int cur_val = m.getValue();
            if(cur_val > pre_val)
            {
                pre_val = cur_val;
                res = m.getKey();
            }
        }
        return res;
    }
}