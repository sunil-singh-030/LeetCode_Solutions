// Last updated: 8/1/2025, 7:01:30 AM
import java.util.*;

class Solution {
    public boolean maxSubstringLength(String s, int k) {
        int n = s.length();
        if (k == 0) return true;

        int[] temp = new int[26], temp1 = new int[26];
        Arrays.fill(temp, n);
        Arrays.fill(temp1, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            temp[c] = Math.min(temp[c], i);
            temp1[c] = Math.max(temp1[c], i);
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != temp[s.charAt(i) - 'a']) continue;
            int end = temp1[s.charAt(i) - 'a'];
            int j = i;
            boolean valid = true;

            while (j <= end) {
                if (temp[s.charAt(j) - 'a'] < i) {
                    valid = false;
                    break;
                }
                end = Math.max(end, temp1[s.charAt(j) - 'a']);
                j++;
            }

            if (valid && !(i == 0 && end == n - 1)) {
                list.add(new int[]{i, end});
            }
        }

        list.sort(Comparator.comparingInt(a -> a[1]));

        int cnt = 0, prev = -1;
        for (int[] i : list) {
            if (i[0] > prev) {
                cnt++;
                prev = i[1];
            }
        }

        return cnt >= k;
    }
}