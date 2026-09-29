class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new TreeSet<>();
        for(char ch : s.toCharArray())
        {
            if(ch >= '0' && ch <= '9')
                set.add(ch - '0');
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        if(list.size() >= 2)
            return list.get(list.size() - 2);
        return -1;
    }
}