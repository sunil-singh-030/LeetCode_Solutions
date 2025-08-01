// Last updated: 8/1/2025, 7:11:53 AM
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n==0){
            return m;
        }
        if (m==0){
            return n;
        }
        int[] curr = new int[m+1];
        int[] prev = new int[m+1];
        for (int i=0 ; i<=m ; i++){
            prev[i] = i;
        }
        for (int i=1 ; i<=n ; i++){
            for (int j=0 ; j<=m ; j++){
                if (j==0){
                    curr[j] = i;
                    continue;
                }
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    curr[j] = prev[j-1];
                }
                else{
                    int ans1 = 1 + prev[j];
                    int ans2 = 1 + prev[j-1];
                    int ans3 = 1 + curr[j-1];
                    curr[j] =  Math.min(Math.min(ans1,ans2),ans3);
                }
            }
            prev = curr.clone();
        }
        return curr[m];
    }
}