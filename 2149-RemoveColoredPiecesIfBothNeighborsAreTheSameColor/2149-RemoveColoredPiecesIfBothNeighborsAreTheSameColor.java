// Last updated: 8/1/2025, 7:04:16 AM
class Solution {
    public boolean winnerOfGame(String colors) {
        int cnta = cntpair(colors,'A');
        int cntb = cntpair(colors,'B');
        return cnta>cntb;
    }
    public static int cntpair(String colors , char ch){
        int cnt = 0;
        int n = colors.length();
        for (int i=1 ; i<n-1 ; i++){
            if (colors.charAt(i)==ch && colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i+1)==colors.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}