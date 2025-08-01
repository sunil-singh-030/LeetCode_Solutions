// Last updated: 8/1/2025, 7:06:08 AM
class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(x,y) -> {
            return Integer.compare(x.length(),y.length());
        });
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for (int i=1 ; i<n ; i++){
            for (int j=0 ; j<i ; j++){
                if (isGoodPair(words[i],words[j])){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 1;
        for (int num : dp){
            max = Math.max(max,num);
        }
        return max;
    }
    public static boolean isGoodPair(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        if (Math.abs(n-m)!=1){
            return false;
        }
        int ind = 0;
        boolean canSkip = true;
        for (int i=0 ; i<n ; i++){
            if (ind==m){
                if (!canSkip){
                    return false;
                }
                canSkip = false;
                continue;
            }
            if (s1.charAt(i)!=s2.charAt(ind)){
                if (!canSkip){
                    return false;
                }
                canSkip = false;
                ind--;
            }
            ind++;
        }
        return canSkip ? false : true;
    }
}