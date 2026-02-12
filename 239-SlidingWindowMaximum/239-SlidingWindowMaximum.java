// Last updated: 2/12/2026, 3:14:50 PM
1class SegTree{
2    int[] arr;
3    int n;
4    public SegTree(int[] nums){
5        n = nums.length;
6        arr = new int[4*n];
7        build(0,0,n-1,nums);
8    }
9    private void build(int idx, int st, int end, int[] nums){
10        if (st==end){
11            arr[idx] = nums[st];
12            return ;
13        }
14        int mid = st + (end-st)/2;
15        build(2*idx+1,st,mid,nums);
16        build(2*idx+2,mid+1,end,nums);
17        arr[idx] = Math.max(arr[2*idx+1],arr[2*idx+2]);
18        
19    }
20    public int query(int idx, int st, int end, int l, int r){
21
22        if (st>=l && end<=r){
23            return arr[idx];
24        }
25        if (st>r || end<l){
26            return Integer.MIN_VALUE;
27        }
28        int mid = st + (end-st)/2;
29        int max1 = query(2*idx+1,st,mid,l,r);
30        int max2 = query(2*idx+2,mid+1,end,l,r);
31        return Math.max(max1,max2);
32
33    }
34}
35class Solution {
36    public int[] maxSlidingWindow(int[] nums, int k) {
37        SegTree seg = new SegTree(nums);
38        int n = nums.length;
39        int[] ans = new int[n-k+1];
40        for (int i=k-1 ; i<nums.length ; i++){
41            ans[i-(k-1)] = seg.query(0,0,n-1,i-k+1,i);
42        }
43        return ans;
44    }
45}