// Last updated: 8/1/2025, 7:10:55 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for (int i=0;i<s.length();i++){
            int chr= (int) (s.charAt(i));
            if (chr>=65 && chr<=90 ){
                str+= (char) (chr+32);
            }
            if (chr>=97 && chr<=122){
                str+=s.charAt(i);
            }
            if (chr>=48 && chr<=57){
                str+=s.charAt(i);
            }
        }
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}