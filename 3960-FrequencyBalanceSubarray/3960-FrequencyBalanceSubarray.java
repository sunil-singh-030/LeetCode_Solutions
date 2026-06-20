// Last updated: 6/20/2026, 9:33:17 AM
1class Solution {
2    public int getLength(int[] nums) {
3        int n = nums.length;
4        int maxLen = 1;
5
6        for (int i=0 ; i<n ; i++){
7            HashMap<Integer,Integer> map = new HashMap<>();
8            for (int j=i ; j<n ; j++){
9                int num = nums[j];
10                map.put(num,map.getOrDefault(num,0)+1);
11                if (map.size()==1){
12                    maxLen = Math.max(maxLen,j-i+1);
13                    continue;
14                }
15            }
16        }
17        for (int i=0 ; i<n ; i++){
18            HashMap<Integer,Integer> map1 = new HashMap<>();
19            TreeMap<Integer,Integer> map2 = new TreeMap<>();
20            for (int j=i ; j<n ; j++){
21                int num = nums[j];
22                map1.put(num,map1.getOrDefault(num,0)+1);
23                int freq = map1.get(num);
24                map2.put(freq,map2.getOrDefault(freq,0)+1);
25                if (map2.containsKey(freq-1)){
26                    int prev = map2.get(freq-1);
27                    if (prev==1){
28                        map2.remove(freq-1);
29                        
30                    }
31                    else{
32                        map2.put(freq-1,prev-1);
33                    }
34                }
35
36                if ((map2.size()==2) && ((map2.firstKey()*2)==map2.lastKey())){
37                    maxLen = Math.max(maxLen,j-i+1);
38                }
39                
40                
41            }
42        }
43        return maxLen;
44    }
45}