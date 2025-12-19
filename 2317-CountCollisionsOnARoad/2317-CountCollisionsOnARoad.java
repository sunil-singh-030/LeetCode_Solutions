// Last updated: 12/19/2025, 11:57:01 AM
class Solution {
    public int countCollisions(String directions) {
        int cnt = 0;
        int n = directions.length();
        // R
        int cntR = 0;
        for (int i=0 ; i<n ; i++){
            if (directions.charAt(i)=='R'){
                cntR++;
            }
            else{
                cnt += cntR;
                cntR = 0;
            }
        }
        int cntL = 0;
        for (int i=n-1 ; i>=0 ; i--){
            if (directions.charAt(i)=='L'){
                cntL++;
            }
            else{
                cnt += cntL;
                cntL = 0;
            }
        }
        return cnt;
    }
}