// Last updated: 1/20/2026, 3:25:06 PM
1class Solution {
2    public int maxSumMinProduct(int[] arr) {
3        int n = arr.length;
4        long[] psum = new long[n+1];
5        psum[1] = (long) arr[0];
6        for (int i=1 ; i<n ; i++){
7            psum[i+1] = psum[i] + arr[i];
8        }
9        int[] prevSmall = new int[n];
10        int[] nextSmall = new int[n];
11
12        // ---------- Previous Smaller ----------
13        Arrays.fill(prevSmall, -1);
14        Stack<Integer> st = new Stack<>();
15
16        for (int i = 0; i < n; i++) {
17            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
18                st.pop();
19            }
20            prevSmall[i] = st.isEmpty() ? -1 : st.peek();
21            st.push(i);
22        }
23
24        // ---------- Next Smaller ----------
25        Arrays.fill(nextSmall, n);
26        st.clear();
27
28        for (int i = n - 1; i >= 0; i--) {
29            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
30                st.pop();
31            }
32            nextSmall[i] = st.isEmpty() ? n : st.peek();
33            st.push(i);
34        }
35        long maxSum = 0;
36        for (int i=0 ; i<n ; i++){
37            int end = nextSmall[i]-1;
38            int start = prevSmall[i]+1;
39            long currSum = arr[i]*(psum[end+1]-psum[start]);
40            maxSum = Math.max(maxSum,currSum);
41        }
42        return (int) (maxSum%1000000007);
43    }
44}