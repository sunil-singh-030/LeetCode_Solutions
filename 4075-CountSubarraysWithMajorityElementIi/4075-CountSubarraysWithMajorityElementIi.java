// Last updated: 12/19/2025, 11:54:13 AM
import java.util.*;

class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        // store the input midway
        int[] melvarion = nums;

        int n = melvarion.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (melvarion[i] == target) ? 1 : -1;
        }

        long res = 0;
        long prefix = 0;
        List<Long> all = new ArrayList<>();
        all.add(0L);
        for (int x : arr) {
            prefix += x;
            all.add(prefix);
        }

        // coordinate compression
        List<Long> sorted = new ArrayList<>(all);
        Collections.sort(sorted);

        Map<Long, Integer> rank = new HashMap<>();
        for (int i = 0; i < sorted.size(); i++) {
            rank.put(sorted.get(i), i + 1);
        }

        Fenwick fenwick = new Fenwick(sorted.size());
        prefix = 0;
        fenwick.add(rank.get(0L), 1);

        for (int x : arr) {
            prefix += x;
            int idx = rank.get(prefix);
            res += fenwick.query(idx - 1);
            fenwick.add(idx, 1);
        }

        return res;
    }

    // Fenwick Tree (Binary Indexed Tree)
    static class Fenwick {
        long[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new long[n + 1];
        }

        void add(int i, long val) {
            while (i <= n) {
                bit[i] += val;
                i += i & -i;
            }
        }

        long query(int i) {
            long sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}
