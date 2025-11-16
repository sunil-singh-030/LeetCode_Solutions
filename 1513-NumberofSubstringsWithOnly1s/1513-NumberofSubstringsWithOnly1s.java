// Last updated: 11/16/2025, 7:55:55 AM
class Solution {
    public int numSub(String s) {
        int cnt = 0;
        int cnt1 = 0;
        for (char ch : s.toCharArray()){
            if (ch=='1'){
                cnt1++;
            }
            else{
                cnt1 = 0;
            }
            cnt += cnt1;
            cnt %= 1000000007;
        }
        return cnt%1000000007;
    }
}