// Last updated: 1/11/2026, 7:44:48 AM
1class Solution {
2    public int minLength(int[] nums, int k) {
3        int n = nums.length;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int minLen = n+1;
6        int si = 0;
7        int ci = 0;
8        int tsum = 0;
9        while (ci<n){
10            if (!map.containsKey(nums[ci])){
11                map.put(nums[ci],1);
12                tsum += nums[ci];
13            }
14            else{
15                map.put(nums[ci],map.get(nums[ci])+1);
16            }
17            while (tsum>=k){
18                minLen = Math.min(minLen,ci-si+1);
19                int freq = map.get(nums[si]);
20                if (freq==1){
21                    tsum -= nums[si];
22                    map.remove(nums[si]);
23                }
24                else{
25                    map.put(nums[si],freq-1);
26                }
27                si++;
28            }
29            ci++;
30        }
31        return minLen==n+1 ? -1 : minLen;
32    }
33}