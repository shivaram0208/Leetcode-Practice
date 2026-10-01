class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++)
        {
            HashSet<Character> set1 = new HashSet<>();
            for(char ch : words[i].toCharArray())
                set1.add(ch);
            for(int j = i + 1; j < words.length; j++)
            {
                HashSet<Character> set2 = new HashSet<>();
                for(char ch : words[j].toCharArray())
                    set2.add(ch); 
                if(set1.size() != set2.size())
                    continue;
                else
                {
                    boolean check = true;
                    ArrayList<Character> list = new ArrayList<>(set2);
                    for(int k = 0; k < list.size(); k++)
                    {
                        if(!(set1.contains(list.get(k))))
                        {
                            check = false;
                            break;
                        }
                    }
                    if(check)
                        count++;
                }
            }
            
        }
        return count;
    }
}