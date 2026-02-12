// Last updated: 2/12/2026, 3:15:47 PM
1class SegTree{
2    int[] arr;
3    int n;
4    public SegTree(int[] nums){
5        n = nums.length;
6        arr = new int[4*n];
7        build(0,0,n-1,nums);
8    }
9    private int build(int idx, int st, int end, int[] nums){
10        if (st==end){
11            arr[idx] = nums[st];
12            return arr[idx];
13        }
14        int mid = st + (end-st)/2;
15        int part1 = build(2*idx+1,st,mid,nums);
16        int part2 = build(2*idx+2,mid+1,end,nums);
17        arr[idx] = Math.max(part1,part2);
18        return arr[idx];
19        
20    }
21    public int query(int idx, int st, int end, int l, int r){
22
23        if (st>=l && end<=r){
24            return arr[idx];
25        }
26        if (st>r || end<l){
27            return Integer.MIN_VALUE;
28        }
29        int mid = st + (end-st)/2;
30        int max1 = query(2*idx+1,st,mid,l,r);
31        int max2 = query(2*idx+2,mid+1,end,l,r);
32        return Math.max(max1,max2);
33
34    }
35}
36class Solution {
37    public int[] maxSlidingWindow(int[] nums, int k) {
38        SegTree seg = new SegTree(nums);
39        int n = nums.length;
40        int[] ans = new int[n-k+1];
41        for (int i=k-1 ; i<nums.length ; i++){
42            ans[i-(k-1)] = seg.query(0,0,n-1,i-k+1,i);
43        }
44        return ans;
45    }
46}