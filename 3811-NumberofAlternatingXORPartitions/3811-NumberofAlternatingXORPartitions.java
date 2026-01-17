// Last updated: 1/17/2026, 9:35:58 PM
1class Solution {
2    public int alternatingXOR(int[] nums, int target1, int target2) {
3        int mod = 1000000007;
4        HashMap<Integer, Integer> endWithT1 = new HashMap<>();
5        HashMap<Integer, Integer> endWithT2 = new HashMap<>();
6        
7        endWithT2.put(0, 1);
8        
9        int currentXor = 0;
10        int result = 0;
11        
12        for (int num : nums) {
13            currentXor ^= num;
14            
15            int countT1 = endWithT2.getOrDefault(currentXor ^ target1, 0);
16            int countT2 = endWithT1.getOrDefault(currentXor ^ target2, 0);
17            
18            result = (countT1 + countT2) % mod;
19            
20            endWithT1.put(currentXor, (endWithT1.getOrDefault(currentXor, 0) + countT1) % mod);
21            endWithT2.put(currentXor, (endWithT2.getOrDefault(currentXor, 0) + countT2) % mod);
22        }
23        
24        return result;
25    }
26}