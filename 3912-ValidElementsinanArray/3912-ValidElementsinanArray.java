// Last updated: 4/30/2026, 11:04:14 PM
1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        int n = nums.length;
5        int[] lmax = new int[n];
6        for (int i=1 ; i<n ; i++){
7            lmax[i] = Math.max(lmax[i-1],nums[i-1]);
8        }
9        int[] rmax = new int[n];
10        for (int i=n-2 ; i>=0 ; i--){
11            rmax[i] = Math.max(rmax[i+1],nums[i+1]);
12        }
13        ans.add(nums[0]);
14        for (int i=1 ; i<n-1 ; i++){
15            if (nums[i]>lmax[i] || nums[i]>rmax[i]){
16                ans.add(nums[i]);
17            }
18        }
19        if (n>1){
20            ans.add(nums[n-1]);
21        }
22        
23        return ans;
24
25    }
26}