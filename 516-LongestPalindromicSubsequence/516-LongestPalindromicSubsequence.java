// Last updated: 8/1/2025, 7:08:14 AM
public class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] prev = new int[n+1];
        int[] curr = new int[n+1];
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n ; j++){
                if (s.charAt(i-1)==s.charAt(n-1-(j-1))){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(prev[j],curr[j-1]);
                }
            }
            prev = curr.clone();
        }
        return curr[n];
    }
   
}