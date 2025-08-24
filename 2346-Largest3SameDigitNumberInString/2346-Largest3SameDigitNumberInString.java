// Last updated: 8/24/2025, 7:45:49 AM
class Solution {
    public String largestGoodInteger(String num) {
        char chr = '_';
        for (int i=2 ; i<num.length() ; i++){
            char ch1 = num.charAt(i-2);
            char ch2 = num.charAt(i-1);
            char ch3 = num.charAt(i);
            if (ch1==ch2 && ch2==ch3){
                if (chr=='_'){
                    chr = ch1;
                }
                else if (ch1-'0'>chr-'0'){
                    chr = ch1;
                }
            }
        }
        return chr=='_' ? "" : ""+chr+chr+chr;
    }
}