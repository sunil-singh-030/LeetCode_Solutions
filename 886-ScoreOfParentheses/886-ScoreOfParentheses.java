// Last updated: 8/1/2025, 7:07:05 AM
class Solution {
    public int scoreOfParentheses(String s) {
        int ans = 0;
        Stack<String> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch=='('){
                st.push("(");
            }
            else{
                String prev = st.pop();
                if (prev.equals("(")){
                    if (!st.isEmpty()){
                        String check = st.peek();
                        if (check.equals("(")){
                            st.push("1");
                        }
                        else{
                            st.pop();
                            int val = Integer.valueOf(check);
                            val++;
                            st.push(String.valueOf(val));
                        }
                    }
                    else{
                        st.push("1");
                    }
                }
                else{
                    st.pop();
                    int val = Integer.valueOf(prev);
                    val += val;
                    if (!st.isEmpty()){
                        String check = st.peek();
                        if (check.equals("(")){
                            st.push(String.valueOf(val));
                        }
                        else{
                            st.pop();
                            val += Integer.valueOf(check);
                            st.push(String.valueOf(val));
                        }
                    }
                    else{
                        st.push(String.valueOf(val));
                    }
                }
            }
            if (st.size()==1){
                String curr = st.pop();
                if (!curr.equals("(") && !curr.equals(")")){
                    ans += Integer.valueOf(curr);
                }
                else{
                    st.push(curr);
                }
            }
        }
        return ans;
    }
}