// Last updated: 11/16/2025, 8:07:13 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (st.isEmpty()){
                st.push(ch);
            }
            else{
                if (st.peek()!=ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}