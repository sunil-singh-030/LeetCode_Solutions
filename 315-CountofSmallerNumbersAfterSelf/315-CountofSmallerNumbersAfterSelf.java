// Last updated: 5/20/2026, 4:04:49 PM
1class SegTree{
2    private int size;
3    private int[] tree;
4    SegTree(int n){
5        size = n;
6        tree = new int[4*n];
7    }
8    void update(int node, int st, int end, int idx){
9        if (st==end){
10            tree[node]++;
11            return;
12        }
13        int mid = st + ((end-st)/2);
14        if (idx<=mid){
15            update(2*node+1,st,mid,idx);
16        }
17        else{
18            update(2*node+2,mid+1,end,idx);
19        }
20        tree[node] = tree[2*node+1] + tree[2*node+2];
21
22    }
23    int query(int node, int st, int end, int l, int r){
24        if (l<=st && end<=r){
25            return tree[node];
26        }
27        if (end<l || st>r){
28            return 0;
29        }
30        int mid = st + ((end-st)/2);
31
32        return query(2*node+1,st,mid,l,r)+query(2*node+2,mid+1,end,l,r);
33
34
35    }
36}
37class Solution {
38    public List<Integer> countSmaller(int[] nums) {
39        int offset = 10000;
40        int size = 20001;
41        SegTree st = new SegTree(size);
42        List<Integer> ans = new ArrayList<>();
43        int n = nums.length;
44        for (int i=n-1 ; i>=0 ; i--){
45            ans.add(st.query(0,0,size-1,0,nums[i]+offset-1));
46            st.update(0,0,size-1,nums[i]+offset);
47            
48        }
49        Collections.reverse(ans);
50        return ans;
51    }
52}