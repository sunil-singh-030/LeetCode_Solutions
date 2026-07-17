// Last updated: 7/17/2026, 7:20:12 AM
1class Solution {
2    public boolean isValid(String s) {
3        int n = s.length();
4        Stack<Character> st = new Stack<>();
5        for (int i=0 ; i<n ; i++){
6            char ch = s.charAt(i);
7            if (ch=='{' || ch=='[' || ch=='(' ){
8                st.push(ch);
9            }
10            else{
11                if (st.isEmpty()){
12                    return false;
13                }
14                else{
15                    char top = st.peek();
16                    if ((ch=='}' && top=='{') || (ch==')' && top=='(') || (ch==']' && top=='[')){
17                        st.pop();
18                    }
19                    else{
20                        return false;
21                    }
22                }
23            }
24        
25        }
26        return st.isEmpty() ? true : false;
27    }
28
29}