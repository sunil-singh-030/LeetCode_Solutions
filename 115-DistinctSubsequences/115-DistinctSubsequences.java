// Last updated: 8/1/2025, 7:11:07 AM
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] curr = new int[m+1];
        int[] prev = new int[m+1];
        prev[0] = 1;
        for (int i=1 ; i<=n ; i++){
            for (int j=0 ; j<=m ; j++){
                if (j==0){
                    curr[j] = 1;
                    continue;
                }
                int ans = 0;
                if (s.charAt(i-1)==t.charAt(j-1)){
                    ans += prev[j-1];
                }
                ans += prev[j];
                curr[j] = ans;
            }
            prev = curr.clone();
        }
        return curr[m];
    }
    
}