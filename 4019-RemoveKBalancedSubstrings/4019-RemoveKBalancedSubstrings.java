// Last updated: 12/19/2025, 11:54:28 AM
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
            out.append(s.charAt(st.pop()));
        }
        StringBuilder ans = new StringBuilder();
        for (int i=out.length()-1 ; i>=0 ; i--){
            ans.append(out.charAt(i));
        }
        return ans.toString();
    }
}