// Last updated: 1/20/2026, 3:55:30 PM
1class Solution {
2    public int validSubarraySize(int[] arr, int threshold) {
3        int n = arr.length;
4        int[] prevSmall = new int[n];
5        int[] nextSmall = new int[n];
6
7        // ---------- Previous Smaller ----------
8        Arrays.fill(prevSmall, -1);
9        Stack<Integer> st = new Stack<>();
10
11        for (int i = 0; i < n; i++) {
12            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
13                st.pop();
14            }
15            prevSmall[i] = st.isEmpty() ? -1 : st.peek();
16            st.push(i);
17        }
18
19        // ---------- Next Smaller ----------
20        Arrays.fill(nextSmall, n);
21        st.clear();
22
23        for (int i = n - 1; i >= 0; i--) {
24            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
25                st.pop();
26            }
27            nextSmall[i] = st.isEmpty() ? n : st.peek();
28            st.push(i);
29        }
30        for (int i=0 ; i<n ; i++){
31            int end = nextSmall[i]-1;
32            int start = prevSmall[i]+1;
33            int len = end-start+1;
34            int req = threshold/arr[i];
35            if (len>req){
36                return req+1;
37            }
38
39        } 
40        return -1;
41    }
42}