// Last updated: 8/1/2025, 7:06:04 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        if (n1 < n2) {
            return longestCommonSubsequence(text2, text1);
        }
        int[] curr = new int[n2+1];
        int[] prev = new int[n2+1];
        for (int i=1 ; i<=n1 ; i++){
            for (int j=1 ; j<=n2 ; j++){
                if (text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(prev[j],curr[j-1]);
                }
            }
            prev = curr.clone(); 
        }
        return prev[n2];
    }
}