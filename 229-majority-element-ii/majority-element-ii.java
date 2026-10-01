class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int val = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);
            if(map.get(a) > val)
            {
                if(!(list.contains(a)))
                    list.add(a);
            }
        }
        return list;
    }
}