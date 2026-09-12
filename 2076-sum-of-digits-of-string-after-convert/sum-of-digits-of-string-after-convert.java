class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            int x = ((ch - 'a') + 1);
            sb.append(String.valueOf(x));
        }
        while(k-- > 0)
        {
            int sum = 0;
            String str = sb.toString();
            for(char ch : str.toCharArray())
            {
                sum += ch - '0';
            }
            sb = new StringBuilder(String.valueOf(sum));
        }
        return Integer.parseInt(sb.toString());
    }
}