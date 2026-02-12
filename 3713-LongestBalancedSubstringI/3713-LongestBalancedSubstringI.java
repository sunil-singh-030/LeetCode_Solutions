// Last updated: 2/12/2026, 11:19:05 AM
1class Solution {
2    public int longestBalanced(String s) {
3        int maxLen = 0;
4        int n = s.length();
5        for (int i=0 ; i<n ; i++){
6            int[] freq = new int[26];
7            for (int j=i ; j<n ; j++ ){
8                freq[s.charAt(j)-'a']++;
9                HashSet<Integer> set = new HashSet<>();
10                for (int num : freq){
11                    if (num>0) {
12                        set.add(num);
13                    }
14                    if (set.size()>1){
15                        break;
16                    }
17                }
18                if (set.size()==1){
19                    maxLen = Math.max(maxLen,j-i+1);
20                }
21            }
22        }
23        return maxLen;
24    }
25}