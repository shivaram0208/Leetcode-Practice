class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int idx = order.indexOf(ch);
            if(idx == -1)
                res2.append(ch);
            else
            {
                int j = 0;
                while(j < res1.length() && order.indexOf(res1.charAt(j)) < idx) // Used to get the index from res1
                    j++;
                res1.insert(j, ch);
            }
        }
        return res1.toString() + res2.toString();
    }
}