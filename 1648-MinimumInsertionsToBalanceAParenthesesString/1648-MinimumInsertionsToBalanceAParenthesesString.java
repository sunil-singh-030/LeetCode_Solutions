// Last updated: 8/1/2025, 7:05:05 AM
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for (int i=0 ; i<n ; i++){
            //System.out.println(i);
            char ch = s.charAt(i);
            if (ch=='('){
                st.push('(');
            }
            else{
                if (i!=n-1){
                    if (s.charAt(i+1)==')'){
                        if (!st.isEmpty()){
                            st.pop();
                            i++;
                        }
                        else{
                            i++;
                            cnt++;
                        }
                    }
                    else{
                        if (!st.isEmpty()){
                            st.pop();
                            cnt++;
                        }
                        else{
                            cnt += 2;
                        }
                        
                    }
                }
                else{
                    if (!st.isEmpty()){
                        st.pop();
                        cnt++;
                    }
                    else{
                        cnt += 2;
                    }
                }
            }
            //System.out.println(cnt+" "+st.size());
        }
        if (st.size()==0){
            return cnt;
        }
        else{
            return cnt+(st.size()*2);
        }
    }
}