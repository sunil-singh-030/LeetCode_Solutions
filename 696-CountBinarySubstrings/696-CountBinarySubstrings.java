// Last updated: 8/1/2025, 7:07:38 AM
class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prevcnt = 0;
        int cnt = 1;
        char ch = s.charAt(0);
        int n = s.length();
        for (int i=1 ; i<n ; i++){
            if (s.charAt(i)==ch){
                cnt++;
            }
            else{
                ans += Math.min(prevcnt,cnt);
                prevcnt = cnt;
                cnt = 1;
                ch = s.charAt(i);
            }
        }
        ans += Math.min(prevcnt,cnt);
        return ans;
    }
}