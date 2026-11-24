class Solution {
    public String[] assignUmbrella(int[] rain) {
        String arr[] = new String[rain.length];
        int Alice_count = 0, Bob_count = 0;
        for(int i = 0; i < rain.length; i++)
        {
            if(rain[i] == 0)
            {
                arr[i] = "None";
                continue;
            }
            if(i <= rain.length - 2)
            {
                if(rain[i] == 1)
                {
                    if(rain[i + 1] == 1)
                    {
                        if(Alice_count <= Bob_count)
                        {
                            arr[i] = "Alice";
                            Alice_count++;
                        }
                        else
                        {
                            arr[i] = "Bob";
                            Bob_count++;
                        }
                    }
                    else
                    {
                        arr[i] = "Bob";
                        Bob_count++;
                    }
                }
            }
            else
            {
                arr[i] = "Bob";
                Bob_count++;
            }
        }
        return arr;
    }
}