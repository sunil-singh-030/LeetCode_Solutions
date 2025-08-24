// Last updated: 8/24/2025, 7:44:02 AM
class Solution {
    public int minSensors(int n, int m, int k) {
        int can = 2*k + 1;
        int cnt = 0;
        cnt += (n/(can));
        if (n%(can)!=0){
            cnt++;
        }
        int need = m/(can);
        if (m%(can)!=0){
            need++;
        }
        if (need==0){
            return cnt;
        }
        else{
            need--;
            cnt = cnt + (cnt*need);
        }
        return cnt;
    }
}