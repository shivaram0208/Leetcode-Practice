class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        int arr[] = new int[nums.length];
        for(int a : nums)
            map.put(a, map.getOrDefault(a, 0) + 1);
        int i = 0;
        while(i < nums.length)
        {
            for(Map.Entry<Integer, Integer> m : map.entrySet())
                {
                    if(m.getValue() > 0)
                    {
                        arr[i++] = m.getKey();
                        m.setValue(m.getValue() - 1);
                    }
                    if(i == nums.length)
                        return arr;
                }
        }
        return arr;
    }
}