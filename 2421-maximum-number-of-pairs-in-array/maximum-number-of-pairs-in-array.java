class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count = 0, rem = 0;
        int arr[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : nums)
            list.add(a);
        Collections.sort(list);
        while(list.size() > 1)
        {
            int val1 = list.get(0), val2 = list.get(1);
            if(val1 == val2)
            {
                count++;
                list.remove(0);
                list.remove(0); // Because, it already removed one element on above, the element becomes as 0 indexed 
            }
            else
            {
                list.remove(0);
                rem++;
            }
        }
        if(!list.isEmpty())
            rem++;
        arr[0] = count;
        arr[1] = rem;
        return arr;
    }
}