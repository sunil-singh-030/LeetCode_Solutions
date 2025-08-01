// Last updated: 8/1/2025, 7:00:59 AM
class Solution {
    public String generateTag(String caption) {
        String out = "#";
        boolean flag = false;
        for (char ch : caption.toCharArray()){
            if (ch==' ' && out.length()>1){
                flag = true;
            }
            int asci = (int) ch;
            if (asci<65 || asci>122){
                continue;
            }
            if (asci>90 && asci<97){
                continue;
            }
            if (flag){
                flag = false;
                out += Character.toUpperCase(ch);
            }
            else{
                out += Character.toLowerCase(ch);
            }
            if (out.length()==100){
                break;
            }
        }
        return out;
    }
}