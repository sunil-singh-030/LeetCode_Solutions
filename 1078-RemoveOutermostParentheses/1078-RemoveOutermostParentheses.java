// Last updated: 8/1/2025, 7:06:13 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder out = new StringBuilder();
        boolean flag = true;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch=='('){
                st.push('(');
                if (!flag){
                    out.append(ch);
                }
                else{
                    flag = false;
                }
            }
            else{
                st.pop();
                if (st.isEmpty()){
                    //out.append(s.substring(si+1,i));
                    flag = true;
                }
                else{
                    out.append(ch);
                }
            }
        }
        return out.toString();
    }
}