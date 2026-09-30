class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++)
        {
            char key = list.get(i).getKey();
            int val = list.get(i).getValue();
            while(val-- > 0)
                sb.append(key);
        }
        return sb.toString();
    }
}