// Last updated: 1/19/2026, 11:24:23 AM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n = arr.length;
4        int mod = 1_000_000_007;
5
6        int[] prevSmall = new int[n];
7        int[] nextSmall = new int[n];
8
9        // ---------- Previous Smaller ----------
10        Arrays.fill(prevSmall, -1);
11        Stack<Integer> st = new Stack<>();
12
13        for (int i = 0; i < n; i++) {
14            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
15                st.pop();
16            }
17            prevSmall[i] = st.isEmpty() ? -1 : st.peek();
18            st.push(i);
19        }
20
21        // ---------- Next Smaller ----------
22        Arrays.fill(nextSmall, n);
23        st.clear();
24
25        for (int i = n - 1; i >= 0; i--) {
26            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
27                st.pop();
28            }
29            nextSmall[i] = st.isEmpty() ? n : st.peek();
30            st.push(i);
31        }
32
33        long ans = 0;
34
35        for (int i = 0; i < n; i++) {
36            long left = i - prevSmall[i];
37            long right = nextSmall[i] - i;
38            ans = (ans + (left * right % mod) * arr[i]) % mod;
39        }
40
41        return (int) ans;
42    }
43}
44