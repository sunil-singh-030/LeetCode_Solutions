// Last updated: 2/15/2026, 8:06:01 AM
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for (int num : nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        HashMap<Integer,Integer> freqMap = new HashMap<>();
8        for (int key : map.keySet()){
9            freqMap.put(map.get(key),freqMap.getOrDefault(map.get(key),0)+1);
10        }
11        for (int num  : nums){
12            if (freqMap.get(map.get(num))==1){
13                return num;
14            }
15        }
16        return -1;
17    }
18}