class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < words.length && sb.length() > 0; i++)
        {
            String str = words[i];
            int a = sb.indexOf(str);
            if(a == 0) // They should starts from 0
                sb.delete(a, a + str.length());
            else
                return false;
        }
        return sb.length() == 0;
    }
}