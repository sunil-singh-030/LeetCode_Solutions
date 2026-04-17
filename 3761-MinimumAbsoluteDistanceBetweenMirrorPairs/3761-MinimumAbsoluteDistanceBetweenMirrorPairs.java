// Last updated: 4/17/2026, 8:48:22 PM
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int n = nums.length;
4        HashMap<Long,Integer> map = new HashMap<>();
5        int ans = n+1;
6        for (int i=0 ; i<n ; i++){
7            if (map.containsKey((long) (nums[i]))){
8                ans = Math.min(ans,i-map.get((long) (nums[i])));
9            }
10            int cnum = nums[i];
11            long nnum = 0;
12            while (cnum>0){
13                nnum = nnum*10 + cnum%10;
14                cnum /= 10;
15            }
16            map.put(nnum,i);
17        }
18        return ans==n+1 ? -1 : ans;
19    }
20}