// Last updated: 1/16/2026, 10:10:32 AM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        int n = changed.length;
4        if (n%2==1){
5            return new int[0];
6        }
7        Arrays.sort(changed);
8        HashMap<Integer,List<Integer>> map = new HashMap<>();
9        for (int i=n-1 ; i>=0 ; i--){
10            int num = changed[i];
11            if (!map.containsKey(num)){
12                map.put(num,new ArrayList<>());
13            }
14            map.get(num).add(i);
15        }
16        //System.out.println(map);
17        int[] ans = new int[n/2];
18        int idx = 0;
19        for (int i=0 ; i<n ; i++){
20            int num = changed[i];
21            if (!map.containsKey(num) || map.get(num).get(map.get(num).size()-1)!=i){
22                continue;
23            }
24            else{
25                map.get(num).remove(map.get(num).size()-1);
26                if (map.get(num).size()==0){
27                    map.remove(num);
28                }
29                int req = num*2;
30                if (map.containsKey(req)){
31                    ans[idx] = num;
32                    idx++;
33                    map.get(req).remove(map.get(req).size()-1);
34                    if (map.get(req).size()==0){
35                        map.remove(req);
36                    }
37                }
38                else{
39                    return new int[0];
40                }
41            }
42            //System.out.println(i+" "+map);
43        }
44        //System.out.println(ans);
45        return ans;
46    }
47}