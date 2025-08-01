// Last updated: 8/1/2025, 7:05:01 AM
class Solution {
    public String makeGood(String s) { 
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (!st.isEmpty()){
                int diff = Math.abs(((int) ch)-((int) st.peek()));
                if (diff==32){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        String out = "";
        while (!st.isEmpty()){
            out = st.pop() + out;
        }
        return out;
    }
}