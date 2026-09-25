class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums)
            map.put(a, map.getOrDefault(a, 0) + 1);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int arr[] = new int[k];
        for(int i = 0; i < k; i++)
            arr[i] = list.get(i).getKey();
        return arr;
    }
}