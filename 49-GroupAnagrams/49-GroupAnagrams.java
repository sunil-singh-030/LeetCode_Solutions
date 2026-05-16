// Last updated: 5/16/2026, 6:43:18 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for (String s : strs){
5            // eat
6            // aet
7            char[] temp = s.toCharArray();
8            Arrays.sort(temp);
9            StringBuilder sb = new StringBuilder();
10            for (char ch : temp){
11                sb.append(ch);
12            }
13            String sortStr = sb.toString();
14            if (map.containsKey(sortStr)){
15                map.get(sortStr).add(s);
16            }
17            else{
18                map.put(sortStr,new ArrayList<>());
19                map.get(sortStr).add(s);
20            }
21        }
22        List<List<String>> ans = new ArrayList<>();
23        for (String key : map.keySet()){
24            ans.add(map.get(key));
25        }
26        return ans;
27    }
28}