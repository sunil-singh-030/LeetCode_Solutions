// Last updated: 4/23/2026, 6:15:24 AM
1class Solution {
2    // [0,1,3,5,6,8] 4 + 
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
14        HashMap<Integer,long[][]> map2 = new HashMap<>();
15        for (int key : map.keySet()){
16            List<Integer> ls = map.get(key);
17            long[][] temp = new long[2][ls.size()];
18            for (int i=1 ; i<ls.size() ; i++){
19                temp[0][i] = temp[0][i-1];
20                temp[0][i] += (ls.get(i)-ls.get(i-1))*(i);
21            }
22            for (int i=ls.size()-2 ; i>=0 ; i--){
23                temp[1][i] = temp[1][i+1];
24                temp[1][i] += (ls.get(i+1)-ls.get(i))*(ls.size()-i-1);
25            }
26            map2.put(key,temp);
27        }
28        long[] arr = new long[n];
29        for (int i=0 ; i<n ; i++){
30            List<Integer> ls = map.get(nums[i]);
31            long[][] temp = map2.get(nums[i]);
32            int len = ls.size();
33            int idx = -1;
34            int st = 0;
35            int end = len-1;
36            while (st<=end){
37                int mid = (st+end)/2;
38                if (ls.get(mid)==i){
39                    idx = mid;
40                    break;
41                }
42                else if (ls.get(mid)>i){
43                    end = mid-1;
44                }
45                else{
46                    st = mid+1;
47                }
48            }
49            arr[i] = temp[0][idx] + temp[1][idx];
50        }
51        return arr;
52    }
53}