// Last updated: 8/1/2025, 7:06:38 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch=='('){
                st.push('(');
            }
            else{
                if (!st.isEmpty()){
                    st.pop();
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt+st.size();
    }
}