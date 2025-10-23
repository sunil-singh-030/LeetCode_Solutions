// Last updated: 10/23/2025, 5:38:59 AM
class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length()>2){
            String str = "";
            for (int i=0 ; i<s.length()-1 ; i++){
                int num1 = s.charAt(i)-'0';
                int num2 = s.charAt(i+1)-'0';
                str += String.valueOf((num1+num2)%10);
            }
            s = str;
        }
        return s.charAt(0)==s.charAt(1);
    }
}