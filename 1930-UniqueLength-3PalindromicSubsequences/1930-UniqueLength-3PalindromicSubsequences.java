// Last updated: 11/21/2025, 9:54:23 AM
class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] stIdx = new int[26];
        int[] endIdx = new int[26];
        Arrays.fill(stIdx,-1);
        Arrays.fill(endIdx,-1);
        int n = s.length();
        for (int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            endIdx[ch-'a'] = i;
            if (stIdx[ch-'a']==-1){
                stIdx[ch-'a'] = i;
            }
        }
        int cnt = 0;
        for (int i=0 ; i<26 ; i++){
            if (stIdx[i]!=-1){
                HashSet<Character> set = new HashSet<>();
                for (int j=stIdx[i]+1 ; j<endIdx[i] ; j++){
                    set.add(s.charAt(j));
                }
                cnt += set.size();
            }
        }
        return cnt;
    }
}