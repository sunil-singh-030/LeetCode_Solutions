// Last updated: 8/1/2025, 7:08:28 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int ind1 = 0;
        int ind2 = 0;
        while (ind1<g.length && ind2<s.length){
            if (s[ind2]>=g[ind1]){
                cnt++;
                ind1++;
                ind2++;
            }
            else{
                ind2++;
            }
        }
        return cnt;
    }
}