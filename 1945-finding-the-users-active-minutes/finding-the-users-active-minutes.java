class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int arr[] = new int[k];
        Arrays.sort(logs, (a, b) -> Integer.compare(a[0], b[0]));
        int prev = logs[0][0];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < logs.length; i++)
        {
            if(prev == logs[i][0])
            {
                set.add(logs[i][1]);
            }
            else
            {
                int tot = set.size();
                arr[tot - 1]++;
                prev = logs[i][0];
                set.clear();
                set.add(logs[i][1]);
            }
        }
        int tot = set.size();
        arr[tot - 1]++;
        return arr;
    }
}