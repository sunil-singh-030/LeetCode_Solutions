// Last updated: 1/9/2026, 4:24:12 PM
1class Solution {
2    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
3        int n = words.length;
4        int[] dp = new int[n];
5        int[] parent = new int[n];
6        Arrays.fill(dp, 1);
7        Arrays.fill(parent, -1);
8
9        int maxLen = 1, endIdx = 0;
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < i; j++) {
13                if (isValid(words[j], words[i], groups[j], groups[i])) {
14                    if (dp[j] + 1 > dp[i]) {
15                        dp[i] = dp[j] + 1;
16                        parent[i] = j;
17                    }
18                }
19            }
20            if (dp[i] > maxLen) {
21                maxLen = dp[i];
22                endIdx = i;
23            }
24        }
25
26        List<String> ans = new ArrayList<>();
27        while (endIdx != -1) {
28            ans.add(words[endIdx]);
29            endIdx = parent[endIdx];
30        }
31        Collections.reverse(ans);
32        return ans;
33    }
34
35    private boolean isValid(String a, String b, int g1, int g2) {
36        if (a.length() != b.length() || g1 == g2) return false;
37        int diff = 0;
38        for (int i = 0; i < a.length(); i++) {
39            if (a.charAt(i) != b.charAt(i)) diff++;
40            if (diff > 1) return false;
41        }
42        return diff == 1;
43    }
44}
45