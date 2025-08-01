// Last updated: 8/1/2025, 7:07:39 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations){
            if (s.equals("C")){
                st.pop();
            }
            else if (s.equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2);
                st.push(n1);
                st.push(n1+n2);
            }
            else if (s.equals("D")){
                int n1 = st.pop();
                st.push(n1);
                st.push(2*n1);
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        int ans = 0;
        while (!st.isEmpty()){
            int n1 = st.pop();
            ans += n1;
        }
        return ans;
    }
}