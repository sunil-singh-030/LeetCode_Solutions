// Last updated: 4/16/2026, 12:07:31 PM
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        HashMap<Integer,List<Integer>> map = new HashMap<>();
5        for (int i=0 ; i<n ; i++){
6            if (!map.containsKey(nums[i])){
7                map.put(nums[i],new ArrayList<>());
8            }
9            map.get(nums[i]).add(i);
10        }
11        List<Integer> ans = new ArrayList<>();
12        for (int q : queries){
13            int num = nums[q];
14            List<Integer> ls = map.get(num);
15            if (ls.size()==1){
16                ans.add(-1);
17                continue;
18            }
19            int idx = -1;
20            int st = 0;
21            int end = ls.size()-1;
22            while (st<=end){
23                int mid = (st+end)/2;
24                if (ls.get(mid)>q){
25                    end = mid-1;
26                }
27                else if (ls.get(mid)<q){
28                    st = mid+1;
29                }
30                else{
31                    idx = mid;
32                    break;
33                }
34            }
35            int minDis = n+1;
36            if (idx>0){
37                int dis = Math.abs(ls.get(idx-1)-ls.get(idx));
38                minDis = Math.min(minDis,Math.min(dis,n-dis));
39            }
40            else{
41                int dis = Math.abs(ls.get(0)-ls.get(ls.size()-1));
42                minDis = Math.min(minDis,Math.min(dis,n-dis));
43            }
44            if (idx<ls.size()-1){
45                int dis = Math.abs(ls.get(idx+1)-ls.get(idx));
46                minDis = Math.min(minDis,Math.min(dis,n-dis));
47            }
48            else{
49                int dis = Math.abs(ls.get(0)-ls.get(ls.size()-1));
50                minDis = Math.min(minDis,Math.min(dis,n-dis));
51            }
52            ans.add(minDis);
53        }
54        return ans;
55    }
56}