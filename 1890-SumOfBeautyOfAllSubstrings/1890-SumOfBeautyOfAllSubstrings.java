// Last updated: 12/19/2025, 11:57:56 AM
class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int tsum = 0;
        for (int i=0 ; i<n; i++){
            int[] freq = new int[26];
            for (int j=i ; j<n ; j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;
                int high = 0;
                int low = n;
                for (int num : freq){
                    if (num>0){
                        high = Math.max(high,num);
                        low = Math.min(low,num);
                    }
                }
                tsum += high-low;
            }
        }
        return tsum;
    }
}