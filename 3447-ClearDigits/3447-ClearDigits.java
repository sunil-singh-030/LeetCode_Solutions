// Last updated: 8/1/2025, 7:02:20 AM
class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if ((int) (ch)<97){
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}