// Last updated: 5/16/2026, 4:42:06 PM
1class Solution {
2    public long minArraySum(int[] nums) {
3        // 2 3 4 8
4        int n = nums.length;
5        Arrays.sort(nums);
6        HashMap<Integer,Integer> map = new HashMap<>();
7        for (int num : nums){
8            map.put(num,map.getOrDefault(num,0)+1);
9        }
10        long minSum = 0;
11        boolean[] vis = new boolean[nums[n-1]+1];
12        vis[0] = true;
13        for (int i=0 ; i<n ; i++){
14            int num = nums[i];
15            if (!vis[num] && map.containsKey(num)){
16                minSum += ((long) map.get(num))*((long) num);
17                map.remove(num);
18                for (int j=num+num ; j<=nums[n-1] ; j+=num){
19                    if (map.containsKey(j)){
20                        minSum += ((long) map.get(j))*((long) num);
21                        map.remove(j);
22                    }
23                    vis[j] = true;
24                }
25            }
26        }
27        return minSum;
28    }
29}