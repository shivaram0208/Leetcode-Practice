class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0, c = 0;
        s = s.replaceAll("[\\d\\s]+", "");
        for(char ch : s.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                v++;
            else
                c++;
        }
        if(c > 0)
            return (int)Math.floor(v / c);
        return 0;
    }
}