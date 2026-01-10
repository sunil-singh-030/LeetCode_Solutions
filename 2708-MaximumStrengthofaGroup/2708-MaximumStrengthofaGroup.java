// Last updated: 1/10/2026, 12:50:35 PM
1class Solution {
2    public long maxStrength(int[] nums) {
3        int n = nums.length;
4        boolean[] visited = new boolean[n];
5        return helper(nums,0,visited);
6    }
7    public long helper(int[] nums, int i, boolean[] visited){
8        if (i==nums.length){
9            boolean check = false;
10            long prd = 1;
11            for (int idx=0 ; idx<nums.length ; idx++){
12                if (visited[idx]){
13                    prd *= (long) nums[idx];
14                    check = true;
15                }
16            }
17            return check ? prd : Long.MIN_VALUE;
18        }
19        visited[i] = true;
20        long take = helper(nums,i+1,visited);
21        visited[i] = false;
22        long notake = helper(nums,i+1,visited);
23        return Math.max(notake,take);
24    }
25}