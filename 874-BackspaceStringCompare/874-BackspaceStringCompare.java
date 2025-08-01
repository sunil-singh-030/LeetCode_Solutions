// Last updated: 8/1/2025, 7:07:12 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch!='#'){
                st1.push(ch);
            }
            else{
                if (!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        Stack<Character> st2 = new Stack<>();
        for (char ch : t.toCharArray()){
            if (ch!='#'){
                st2.push(ch);
            }
            else{
                if (!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        if (st1.size()!=st2.size()){
            return false;
        }
        while (!st1.isEmpty()){
            if (st1.pop()!=st2.pop()){
                return false;
            }
        }
        return true;
    }
}