// Last updated: 2/12/2026, 12:01:52 PM
1class TrieNode{
2    TrieNode[] child;
3    boolean isEnd;
4    public TrieNode(){
5        child = new TrieNode[2];
6        isEnd = false;
7    }
8}
9class Trie{
10    private TrieNode root;
11    public Trie(){
12        root = new TrieNode();
13    }
14    public void insert(int num){
15        TrieNode curr = root;
16        for (int i = 31; i >= 0; i--) {
17            int bit = (num >> i) & 1;
18
19            if (curr.child[bit] == null) {
20                curr.child[bit] = new TrieNode();
21            }
22
23            curr = curr.child[bit];
24        }
25        curr.isEnd = true;
26    }
27    public int search(int num){
28        TrieNode curr = root;
29
30        if (curr.child[0] == null && curr.child[1] == null)
31            return -1;   // no number inserted
32
33        int ans = 0;
34
35        for (int i = 31; i >= 0; i--){
36            int bit = (num >> i) & 1;
37
38            // try to go opposite bit for max XOR
39            if (curr.child[1 - bit] != null){
40                ans |= (1 << i);   // set ith bit
41                curr = curr.child[1 - bit];
42            } else {
43                curr = curr.child[bit];
44            }
45        }
46
47        return ans;
48    }
49
50}
51class Solution {
52    public int[] maximizeXor(int[] nums, int[][] queries) {
53        Trie t = new Trie();
54        Arrays.sort(nums);
55        int n = queries.length;
56        int[][] temp = new int[n][3];
57        for (int i=0 ; i<n ; i++){
58            temp[i][0] = i;
59            temp[i][1] = queries[i][0];
60            temp[i][2] = queries[i][1];
61        }
62        Arrays.sort(temp,(a,b)->a[2]-b[2]);
63        int[] ans = new int[queries.length];
64        //Arrays.fill(ans,-1);;
65        int idx = 0;
66        for (int i=0 ; i<n ; i++){
67            int[] q = temp[i];
68            while (idx<nums.length && nums[idx]<=q[2]){
69                t.insert(nums[idx]);
70                idx++;
71            }
72            ans[q[0]] = t.search(q[1]);
73
74        }
75        return ans;
76    }
77}