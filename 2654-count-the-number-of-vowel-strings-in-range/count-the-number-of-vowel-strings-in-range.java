class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while(left <= right)
        {
            String str = words[left];
            int len = str.length();
            if("aeiou".contains(String.valueOf(str.charAt(0)))  && "aeiou".contains(String.valueOf(str.charAt(len - 1))))
                count++;
            left++;
        }
        return count;
    }
}