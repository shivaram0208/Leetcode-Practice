class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a : nums)
        {
            if(!pq.contains(a))
                pq.add(a);
            if(pq.size() > 3)
                pq.poll();
        }
        if(pq.size() == 3)
            return pq.peek();
        return Collections.max(pq);
    }
}