// Last updated: 5/16/2026, 4:43:51 PM
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
11        
12        for (int i=0 ; i<n ; i++){
13            int num = nums[i];
14            if (map.containsKey(num)){
15                minSum += ((long) map.get(num))*((long) num);
16                map.remove(num);
17                for (int j=num+num ; j<=nums[n-1] ; j+=num){
18                    if (map.containsKey(j)){
19                        minSum += ((long) map.get(j))*((long) num);
20                        map.remove(j);
21                    }
22                    
23                }
24            }
25        }
26        return minSum;
27    }
28}