class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for(int i = 0; i < colors.length; i++)
        {
            if(i == 0)
            {
                if(colors[i + 1] != colors[i] && colors[colors.length - 1] != colors[i])
                    count++;
            }
            else if(i == colors.length - 1)
            {
                if(colors[i - 1] != colors[i] && colors[0] != colors[i])
                    count++;
            }
            else
            {
                if(colors[i - 1] != colors[i] && colors[i + 1] != colors[i])
                    count++;
            }
        }
        return count;
    }
}