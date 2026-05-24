// Last updated: 5/24/2026, 1:57:27 PM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        int[] left = new int[101];
4        Arrays.fill(left,k);
5        List<Integer> ls = new ArrayList<>();
6        for (int num : nums){
7            if (left[num]>0){
8                ls.add(num);
9                left[num]--;
10            }
11        }
12        int[] ans = new int[ls.size()];
13        for (int i=0 ; i<ls.size() ; i++){
14            ans[i] = ls.get(i);
15        }
16        return ans;
17    }
18}