class Solution {
    public boolean scoreBalance(String s) {
        for(int i = 1; i < s.length(); i++)
        {
            String str1 = s.substring(0, i);
            String str2 = s.substring(i);
            int sum1 = 0, sum2 = 0;
            for(char ch : str1.toCharArray())
                sum1 += ((ch - 'a') + 1);
            for(char ch : str2.toCharArray())
                sum2 += ((ch - 'a') + 1);
            if(sum1 == sum2)
                return true;
        }
        return false;
    }
}