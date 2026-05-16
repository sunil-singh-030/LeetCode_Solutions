// Last updated: 5/16/2026, 4:39:45 PM
1class Solution {
2    public long minArraySum(int[] nums) {
3        // 2 3 4 8
4        Arrays.sort(nums);
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for (int num : nums){
7            map.put(num,map.getOrDefault(num,0)+1);
8        }
9        long minSum = 0;
10        boolean[] vis = new boolean[100001];
11        vis[0] = true;
12        for (int i=0 ; i<nums.length ; i++){
13            int num = nums[i];
14            if (!vis[num] && map.containsKey(num)){
15                minSum += ((long) map.get(num))*((long) num);
16                map.remove(num);
17                for (int j=num+num ; j<100001 ; j+=num){
18                    if (map.containsKey(j)){
19                        minSum += ((long) map.get(j))*((long) num);
20                        map.remove(j);
21                    }
22                    vis[j] = true;
23                }
24            }
25        }
26        return minSum;
27    }
28}