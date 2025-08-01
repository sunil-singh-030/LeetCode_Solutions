// Last updated: 8/1/2025, 7:07:51 AM
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int cntPalin = 0;
        for (int i=0 ; i<n ; i++){
            cntPalin++;
            int left = i-1;
            int right = i+1;
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                cntPalin++;
                left--;
                right++;
            }
        }
        for (int i=0 ; i<n ; i++){
            int left = i;
            int right = i+1;
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                cntPalin++;
                left--;
                right++;
            }
        }
        return cntPalin;
    }

    
}