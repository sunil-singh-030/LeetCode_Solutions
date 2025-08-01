// Last updated: 8/1/2025, 7:12:53 AM
class Solution {
    public boolean isValid(String s) {
        if (s.length()%2==1){
            return false;
        }
        StringBuilder sb=new StringBuilder();
        for (char ch:s.toCharArray()){
            if (ch=='(' || ch=='[' || ch=='{'){
                sb.append(ch);
            }
            else{
                if (sb.length()==0){
                    return false;
                }
                if (ch==')' && sb.charAt(sb.length()-1)=='('){
                    sb.deleteCharAt(sb.length()-1);
                }
                else if (ch==']' && sb.charAt(sb.length()-1)=='[') {
                    sb.deleteCharAt(sb.length()-1);
                }
                else if (ch=='}' && sb.charAt(sb.length()-1)=='{'){
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    return false;
                }
            }
            System.out.println();
        }
        return sb.length()==0;
    }
}