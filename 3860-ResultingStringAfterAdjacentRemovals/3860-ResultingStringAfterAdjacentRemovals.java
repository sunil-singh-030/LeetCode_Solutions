// Last updated: 8/1/2025, 7:01:07 AM
class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (st.isEmpty()){
                st.push(ch);
            }
            else{
                char ch1 = st.peek();
                int diff = Math.abs((int) (ch)-(int)(ch1));
                if (diff!=1 && diff!=25){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }
        }
        StringBuilder out = new StringBuilder();
        while (!st.isEmpty()){
            out.insert(0,st.pop());
        }
        return out.toString();
    }
}