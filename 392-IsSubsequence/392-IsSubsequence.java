// Last updated: 8/1/2025, 7:08:51 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int ind = 0;
        for (char ch : t.toCharArray()){
            if (ch==s.charAt(ind)){
                ind++;
            }
            if (ind==s.length()){
                return true;
            }
        }
        return false;
    }
}