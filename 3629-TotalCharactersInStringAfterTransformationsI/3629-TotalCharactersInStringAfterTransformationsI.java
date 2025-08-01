// Last updated: 8/1/2025, 7:02:05 AM
class Solution {
    private final int MOD = 1000000007;

    private int mod(int x) {
        return ((x % MOD) + MOD) % MOD;
    }

    public int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        while (t-- > 0) {
            int[] freq1 = new int[26];

            for (int i = 0; i < 25; i++) {
                freq1[i] = (freq1[i] + mod(-freq[i])) % MOD;
                freq1[i + 1] = (freq1[i + 1] + mod(freq[i])) % MOD;
            }

            // Handle 'z' (index 25)
            freq1[25] = (freq1[25] + mod(-freq[25])) % MOD;
            freq1[0] = (freq1[0] + mod(freq[25])) % MOD;
            freq1[1] = (freq1[1] + mod(freq[25])) % MOD;

            for (int i = 0; i < 26; i++) {
                freq[i] = (freq[i] + freq1[i]) % MOD;
            }
        }

        int len = 0;
        for (int num : freq) {
            len = (len + num) % MOD;
        }

        return len;
    }
}
