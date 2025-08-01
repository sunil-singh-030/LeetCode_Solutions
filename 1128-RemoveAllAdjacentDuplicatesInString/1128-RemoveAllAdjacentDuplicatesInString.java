// Last updated: 8/1/2025, 7:06:10 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (!st.isEmpty() && st.peek()==ch){
                st.pop();
                continue;
            }
            st.push(ch);
        }
        StringBuilder  out = new StringBuilder();
        while (!st.isEmpty()){
            out.insert(0,String.valueOf(st.pop()));
        }
        return out.toString();
    }
}