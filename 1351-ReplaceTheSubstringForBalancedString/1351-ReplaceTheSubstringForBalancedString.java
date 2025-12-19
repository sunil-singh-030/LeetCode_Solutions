// Last updated: 12/19/2025, 11:58:43 AM
class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int limit = n / 4;
        
        // Step 1: count frequencies
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        
        // Step 2: if already balanced, return 0
        if (count['Q'] == limit && count['W'] == limit && count['E'] == limit && count['R'] == limit) {
            return 0;
        }
        
        int res = n;
        int si = 0;
        
        // Step 3: sliding window
        for (int ci = 0; ci < n; ci++) {
            count[s.charAt(ci)]--;
            
            // shrink while valid
            while (si < n && count['Q'] <= limit && count['W'] <= limit &&
                   count['E'] <= limit && count['R'] <= limit) {
                res = Math.min(res, ci - si + 1);
                count[s.charAt(si)]++;
                si++;
            }
        }
        
        return res;
    }
}
