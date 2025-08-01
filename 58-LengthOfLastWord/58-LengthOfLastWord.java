// Last updated: 8/1/2025, 7:12:05 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        for (int i=s.length()-1 ; i>=0 ; i--){
            if (!flag){
                if (s.charAt(i)==' '){
                continue;
                }
                else{
                    len = 1;
                    flag = true;
                }
            }
            else{
                if (s.charAt(i)==' '){
                    break;
                }
                else{
                    len++;
                }
            }
        }
        return len;
    }
}