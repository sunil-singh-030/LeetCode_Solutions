// Last updated: 8/1/2025, 7:05:56 AM
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int mlen = 0;
        int si = 0;
        int ci = 0;
        int n = s.length();
        int cost = 0;
        while (ci<n){
            char ch1 = s.charAt(ci);
            char ch2 = t.charAt(ci);
            cost += Math.abs(ch1-ch2);
            if (cost>maxCost){
                mlen = Math.max(mlen,ci-si);
                while (cost>maxCost){
                    char c1 = s.charAt(si);
                    char c2 = t.charAt(si);
                    cost -= Math.abs(c1-c2);
                    si++;
                }
            }
            ci++;
        }
        mlen = Math.max(mlen,ci-si);
        return mlen;
    }
}