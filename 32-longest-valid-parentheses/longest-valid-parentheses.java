class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1); // Starts from -1 index
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(i);
            else
            {
                st.pop();
                if(st.isEmpty())
                    st.push(i); // To get the value for max because peek() is used
                else
                    max = Math.max(max, i - st.peek()); // current index - index before the valid substring
            }
        }
        return max;
    }
}