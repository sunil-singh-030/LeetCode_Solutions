// Last updated: 12/19/2025, 11:54:20 AM
class Solution {
    public int longestBalanced(String s) {
        int maxLen = 0;
        int n = s.length();
        for (int i=0 ; i<n ; i++){
            int[] freq = new int[26];
            for (int j=i ; j<n ; j++ ){
                freq[s.charAt(j)-'a']++;
                HashSet<Integer> set = new HashSet<>();
                for (int num : freq){
                    if (num>0) {
                        set.add(num);
                    }
                    if (set.size()>1){
                        break;
                    }
                }
                if (set.size()==1){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}