// Last updated: 2/9/2026, 11:50:40 AM
1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        int n = nums.length;
4
5        long tcnt = 0;
6        TreeMap<Long,Integer> map = new TreeMap<>();
7        int si = 0;
8        int ci = 0;
9        while (ci<n){
10            map.put((long)nums[ci],map.getOrDefault((long) nums[ci],0)+1);
11            while (((map.lastKey()-map.firstKey())*(ci-si+1))>k){
12                long num = (long) nums[si];
13                int freq = map.get(num);
14                if (freq==1){
15                    map.remove(num);
16                }
17                else{
18                    map.put(num,freq-1);
19                }
20                si++;
21            }
22            tcnt += (ci-si+1);
23            ci++;
24        }
25        
26        return tcnt;
27    }
28}