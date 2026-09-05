class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        int prev = 0;
        for(int i = 0; i < logs.size(); i++)
        {
            String str[] = logs.get(i).split(":");
            int id = Integer.parseInt(str[0]);
            String type = str[1];
            int time = Integer.parseInt(str[2]);
            if(type.equals("start"))
            {
                if(!st.isEmpty())
                {
                    arr[st.peek()] += time - prev;
                }
                st.push(id);
                prev = time;
            }
            else
            {
                arr[st.pop()] += time - prev + 1;
                prev = time + 1;
            }
        }
        return arr;
    }
}