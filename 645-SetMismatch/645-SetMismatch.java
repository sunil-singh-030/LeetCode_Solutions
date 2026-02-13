// Last updated: 2/13/2026, 9:58:42 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        boolean[] found = new boolean[n+1];
6        for (int num : nums){
7            found[num] = true;
8        }
9        List<Integer> ans = new ArrayList<>();
10        for (int i=1 ; i<=n ; i++){
11            if (!found[i]){
12                ans.add(i);
13            }
14        }
15        return ans;
16    }
17}