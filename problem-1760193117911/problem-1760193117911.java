// Last updated: 10/11/2025, 8:01:57 PM
class Solution {
    public boolean scoreBalance(String s) {
        int ts = 0;
        for (char ch : s.toCharArray()){
            ts += (ch-'a')+1;
        }
        int cs = 0;
        for (int i=0 ; i<s.length() ; i++){
            cs += (s.charAt(i)-'a')+1;
            if (ts-cs==cs){
                return true;
            }
        }
        return false;
    }
}