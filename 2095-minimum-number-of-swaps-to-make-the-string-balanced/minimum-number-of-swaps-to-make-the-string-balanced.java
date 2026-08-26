class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>(); // Used to find perfect Brackets like [] and remove
        char arr[] = s.toCharArray();
        int count = 0; // Used to find the mismatched brackets parts
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '[')
                st.push(arr[i]);
            else
            {
                if(!st.isEmpty() && st.peek() == '[')
                    st.pop();
                else
                    count++;
            }
        }
        return (count + 1) / 2;
    }
}