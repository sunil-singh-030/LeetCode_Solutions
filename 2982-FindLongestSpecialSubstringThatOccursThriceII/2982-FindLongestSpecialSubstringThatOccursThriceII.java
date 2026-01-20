// Last updated: 1/20/2026, 11:33:53 AM
class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][] top = new int[26][3];
        int[] total = new int[26];

        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) j++;
            int len = j - i;
            int c = s.charAt(i) - 'a';

            total[c] += len;

            if (len > top[c][0]) {
                top[c][2] = top[c][1];
                top[c][1] = top[c][0];
                top[c][0] = len;
            } else if (len > top[c][1]) {
                top[c][2] = top[c][1];
                top[c][1] = len;
            } else if (len > top[c][2]) {
                top[c][2] = len;
            }

            i = j;
        }

        int ans = -1;

        for (int c = 0; c < 26; c++) {
            int a = top[c][0], b = top[c][1], d = top[c][2];

            if (a >= 3) ans = Math.max(ans, a - 2);
            if (b > 0) ans = Math.max(ans, (a + b - 1) / 2);
            if (d > 0) ans = Math.max(ans, Math.min(a, Math.min(b, d)));
            if (total[c] >= 3) ans = Math.max(ans, 1);
        }

        return ans <= 0 ? -1 : ans;
    }
}
