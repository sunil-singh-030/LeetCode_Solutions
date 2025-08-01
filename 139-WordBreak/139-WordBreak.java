// Last updated: 8/1/2025, 7:10:44 AM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for (int i=0 ; i<wordDict.size() ; i++){
            set.add(wordDict.get(i));
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        for (int i=n-1 ; i>=0 ; i--){
            StringBuilder sb = new StringBuilder();
            for (int ind=i ; ind<n ; ind++){
                sb.append(s.charAt(ind));
                if (set.contains(sb.toString())){
                    if (dp[ind+1]==1){
                        dp[i] = 1;
                        break;
                    }
                }
            }
        }
        return dp[0]==1;
    }
}