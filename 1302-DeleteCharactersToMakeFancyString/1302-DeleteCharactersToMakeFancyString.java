// Last updated: 8/1/2025, 7:05:59 AM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (sb.length()>=2 && sb.charAt(sb.length()-2)==sb.charAt(sb.length()-1) ){
                if (sb.charAt(sb.length()-1)==ch){
                    continue;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}