// Last updated: 8/1/2025, 7:02:43 AM
class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long cnt = 0;
        int ind = 0;
        for (int i=0 ; i<n ; i++){
            if (s.charAt(i)=='0'){
                cnt += i-ind;
                ind++;
            }
        }
        return cnt;
    }
}