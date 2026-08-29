class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            int val1 = arr1[i];
            boolean check = true;
            for(int j = 0; j < arr2.length; j++)
            {
                int val2 = arr2[j];
                if(Math.abs(val1 - val2) <= d)
                {
                    check = false;
                    break;
                }
            }
            if(check)
                count++;
        }
        return count;
    }
}