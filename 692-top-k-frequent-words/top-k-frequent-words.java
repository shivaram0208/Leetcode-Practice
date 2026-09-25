class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : words)
        {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> 
        {
            if(!(a.getValue().equals(b.getValue())))
                return b.getValue() - a.getValue(); // For frequency Sorting by descending
            return a.getKey().compareTo(b.getKey()); // For lexicographical sorting when same frequency by ascending
        });
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        while(i < k)
        {
            res.add(list.get(i).getKey());
            i++;
        }
        return res;
    }
}