// Last updated: 3/24/2026, 11:33:17 AM
1class NumArray {
2    private int n;
3    private int[] tree;
4    public NumArray(int[] nums) {
5        this.n = nums.length;
6        tree = new int[4*n];
7        build(0,0,n-1,nums);
8    }
9    
10    public void build(int idx, int st, int end, int[] nums){
11        if (st==end){
12            tree[idx] = nums[st];
13            return;
14        }
15        int mid = (st+end)/2;
16        build(2*idx+1,st,mid,nums);
17        build(2*idx+2,mid+1,end,nums);
18        tree[idx] = tree[2*idx+1] + tree[2*idx+2];
19    }
20    public void update(int index, int val) {
21        update2(0,0,n-1,index,val);
22    }
23    public void update2(int idx, int st, int end, int index, int val){
24        if (st==end){
25            tree[idx] = val;
26            return;
27        }
28        int mid = (st+end)/2;
29        if (index<=mid){
30            update2(2*idx+1,st,mid,index,val);
31        }
32        else{
33            update2(2*idx+2,mid+1,end,index,val);
34        }
35        tree[idx] = tree[2*idx+1] + tree[2*idx+2];
36    }
37    public int sumRange(int left, int right) {
38        return query(0,0,n-1,left,right);
39        
40    }
41    public int query(int idx, int st, int end, int l ,int r){
42        if (st>r || end<l){
43            return 0;
44        }
45        if (l<=st && end<=r){
46            return tree[idx];
47        }
48        int mid = (st+end)/2;
49        int lsum = query(2*idx+1,st,mid,l,r);
50        int rsum = query(2*idx+2,mid+1,end,l,r);
51        return lsum+rsum;
52    }
53}
54
55/**
56 * Your NumArray object will be instantiated and called as such:
57 * NumArray obj = new NumArray(nums);
58 * obj.update(index,val);
59 * int param_2 = obj.sumRange(left,right);
60 */