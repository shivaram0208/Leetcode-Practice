class Solution {
    public int[] frequencySort(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int a : nums)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int arr[] = new int[nums.length];
        int i = 0;
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) 
            {
                return Integer.compare(a.getValue(), b.getValue());
            }
        return Integer.compare(b.getKey(), a.getKey());
        }); // This will sort in acsending based on the value and if the value are same, they will sort in descending based on the key. 
        for(Map.Entry<Integer, Integer> m : list)
        {
            int key = m.getKey();
            int val = m.getValue();
            while(val-- > 0)
            {
                arr[i] = key;
                i++;
            }
        }
        return arr;
    }
}