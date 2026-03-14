// Last updated: 3/14/2026, 8:18:43 PM
1class Solution {
2    public int minCost(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for (int n : nums1){
5            map.put(n,map.getOrDefault(n,0)+1);
6        }
7        for (int n : nums2){
8            map.put(n,map.getOrDefault(n,0)-1);
9        }
10        List<Integer> remove = new ArrayList<>();
11        int s1 = 0;
12        int s2 = 0;
13        for (int key : map.keySet()){
14            if (Math.abs(map.get(key))%2==1){
15                return -1;
16            }
17            else if (map.get(key)!=0){
18                if (map.get(key)>0){
19                    s1 += map.get(key);
20                }
21                else{
22                    s2 += map.get(key);
23                }
24            }
25        }
26        if (s1+s2!=0){
27            return -1;
28        }
29        return s1/2;
30        
31    }
32}