// Last updated: 10/23/2025, 9:52:03 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for (int i=0 ; i<n ; i++){
            int currAste = asteroids[i];
            if (st.isEmpty()){
                st.push(currAste);
            }
            else{
                boolean pushIt = true;
                while (!st.isEmpty()){
                    int topAst = st.peek();
                    if (topAst>-1 && currAste<0){
                        if (-currAste==topAst){
                            st.pop();
                            pushIt = false;
                            break;
                        }
                        else if (-currAste>topAst){
                            st.pop();
                        }
                        else{
                            pushIt = false;
                            break;
                        }
                    }
                    else{
                        break;
                    }
                }
                if (pushIt){
                    st.push(currAste);
                }
            }	
        }
        int[] ans = new int[st.size()];
        for (int i=ans.length-1 ; i>=0 ; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}