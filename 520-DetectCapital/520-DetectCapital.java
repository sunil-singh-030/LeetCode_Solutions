// Last updated: 8/1/2025, 7:08:10 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        if ( ((int) word.charAt(0))<97){
            int c=0;
            for (int i=1;i<word.length();i++){
                if ( ((int) word.charAt(i))<97){
                    c++;
                }
            }
            if (c==0){
                return true;
            }
            return c==word.length()-1;
        }
        else{
            for (int i=1;i<word.length();i++){
                if ( ((int) word.charAt(i))<97){
                    return false;
                }
            }
            return true;
        }
    }
}