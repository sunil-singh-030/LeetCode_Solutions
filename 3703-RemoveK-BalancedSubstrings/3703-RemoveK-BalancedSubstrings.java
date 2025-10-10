// Last updated: 10/10/2025, 12:31:51 PM
class Solution {
    public String removeSubstring(String s, int k) {
        int n = s.length();
        int[][] state = new int[n][2];
        int cnt1 = 0;
        int cnt2 = 0;
        Stack<Integer> st = new Stack<>();
        for (int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            st.push(i);
            if (ch=='('){
                if (cnt2==0){
                    cnt1++;
                }
                else{
                    cnt1 = 1;
                    cnt2 = 0;
                }
            }
            else{
                if (cnt1>0){
                    cnt2++;
                }
                else{
                    cnt1 = 0;
                    cnt2 = 0;
                }
            }
            state[i][0] = cnt1;
            state[i][1] = cnt2;
            if (cnt1>=cnt2 && cnt2==k){
                int ind = -1;
                int move = 2*k;
                while (move-->0){
                    ind = st.pop();
                }
                ind--;
                if (cnt1>cnt2){
                    cnt1 -= cnt2;
                    cnt2 = 0;
                }
                else if (ind>0){
                    cnt1 = state[ind][0];
                    cnt2 = state[ind][1];
                }
                else{
                    cnt1 = 0;
                    cnt2 = 0;
                }
            }
            
        }
        StringBuilder out = new StringBuilder();
        while (!st.isEmpty()){
            out.insert(0,s.charAt(st.pop()));
        }
        return out.toString();
    }
}