// Last updated: 8/1/2025, 7:04:24 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        if (!word.contains(String.valueOf(ch))){
            return word;
        }
        int c = 0;
        for (char char1 : word.toCharArray()){
            c++;
            st.push(char1);
            if (char1==ch){
                break;
            }
        }
        String out = "";
        while (!st.isEmpty()){
                out += st.pop();
            }
        out += word.substring(c);
        return out;
        
        
    }
}