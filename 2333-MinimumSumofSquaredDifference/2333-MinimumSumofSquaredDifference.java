// Last updated: 1/11/2026, 9:46:12 AM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        TreeMap<Integer, Integer> map = new TreeMap<>();
4        for(int i=0;i<nums1.length;i++){
5            int diff = Math.abs(nums1[i] - nums2[i]);
6            map.put(diff,map.getOrDefault(diff,0)+1);
7        }
8        while(k1+k2 >0){
9            int largest = map.lastKey();
10            if(largest == 0) break;
11            int toRemove = Math.min(k1+k2, map.get(largest));
12            map.put(largest-1,map.getOrDefault(largest-1,0)+toRemove);
13            k1 -= Math.min(k1+k2, map.get(largest));
14            map.put(largest,map.get(largest)-toRemove);
15            if(map.get(largest) == 0) map.remove(largest);
16        }
17        long result = 0;
18        for(int key: map.keySet()){
19            result += 1L*map.get(key)*key*key;
20        }
21        return result;
22    }
23}