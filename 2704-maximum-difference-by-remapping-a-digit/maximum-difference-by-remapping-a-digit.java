class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        char val = ' '; // First None nine char
        for(char ch : str.toCharArray())
        {
            if(ch != '9')
            {
                val = ch;
                break;
            }
        }
        String max = str.replace(val, '9');
        String min = str.replace(str.charAt(0), '0');
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}