class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < l.length; i++)
        {
            int arr[] = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(arr);
            boolean check = true;
            for(int j = 1; j < arr.length; j++)
            {
                if(arr[j] - arr[j - 1] != arr[1] - arr[0])
                {
                    check = false;
                    list.add(false);
                    break;
                }
            }
            if(check)
                list.add(true);
        }
        return list;
    }
}