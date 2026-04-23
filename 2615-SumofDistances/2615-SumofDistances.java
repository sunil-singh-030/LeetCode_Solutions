// Last updated: 4/23/2026, 6:20:55 AM
1class Solution {
2    // [0,1,3,5,6,8]  [0,1,4,9,15,23]
3    // [0,0,10,4,2,0]
4    public long[] distance(int[] nums) {
5        int n = nums.length;
6        HashMap<Integer,List<Integer>> map = new HashMap<>();
7        for (int i=0 ; i<n ; i++){
8            int num = nums[i];
9            if (!map.containsKey(num)){
10                map.put(num,new ArrayList<>());
11            }
12            map.get(num).add(i);
13        }
14        //HashMap<Integer,long[][]> map2 = new HashMap<>();
15        long[] arr = new long[n];
16        for (int key : map.keySet()){
17            List<Integer> ls = map.get(key);
18            long[][] temp = new long[2][ls.size()];
19            for (int i=1 ; i<ls.size() ; i++){
20                temp[0][i] = temp[0][i-1];
21                temp[0][i] += (ls.get(i)-ls.get(i-1))*(i);
22            }
23            for (int i=ls.size()-2 ; i>=0 ; i--){
24                temp[1][i] = temp[1][i+1];
25                temp[1][i] += (ls.get(i+1)-ls.get(i))*(ls.size()-i-1);
26            }
27            for (int i=0 ; i<ls.size() ; i++){
28                arr[ls.get(i)] = temp[0][i] + temp[1][i];
29            }
30        }
31        
32        // for (int i=0 ; i<n ; i++){
33        //     List<Integer> ls = map.get(nums[i]);
34        //     long[][] temp = map2.get(nums[i]);
35        //     int len = ls.size();
36        //     int idx = -1;
37        //     int st = 0;
38        //     int end = len-1;
39        //     while (st<=end){
40        //         int mid = (st+end)/2;
41        //         if (ls.get(mid)==i){
42        //             idx = mid;
43        //             break;
44        //         }
45        //         else if (ls.get(mid)>i){
46        //             end = mid-1;
47        //         }
48        //         else{
49        //             st = mid+1;
50        //         }
51        //     }
52        //     arr[i] = temp[0][idx] + temp[1][idx];
53        // }
54        return arr;
55    }
56}