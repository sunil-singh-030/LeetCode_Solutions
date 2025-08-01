// Last updated: 8/1/2025, 7:04:49 AM
class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x>y){
            int points = 0;
            Stack<Character> st = new Stack<>();
            for (char ch : s.toCharArray()){
                if (ch!='b'){
                    st.push(ch);
                }
                else{
                    if (!st.isEmpty() && st.peek()=='a'){
                        st.pop();
                        points += x;
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()){
                sb.append(st.pop());
            }
            sb = sb.reverse();
            s = sb.toString();
            for (char ch : s.toCharArray()){
                if (ch!='a'){
                    st.push(ch);
                }
                else{
                    if (!st.isEmpty() && st.peek()=='b'){
                        st.pop();
                        points += y;
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
            return points;
        }
        else{
            int points = 0;
            Stack<Character> st = new Stack<>();
            for (char ch : s.toCharArray()){
                if (ch!='a'){
                    st.push(ch);
                }
                else{
                    if (!st.isEmpty() && st.peek()=='b'){
                        st.pop();
                        points += y;
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()){
                sb.append(st.pop());
            }
            sb = sb.reverse();
            s = sb.toString();
            for (char ch : s.toCharArray()){
                if (ch!='b'){
                    st.push(ch);
                }
                else{
                    if (!st.isEmpty() && st.peek()=='a'){
                        st.pop();
                        points += x;
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
            return points;
        }
    }
}