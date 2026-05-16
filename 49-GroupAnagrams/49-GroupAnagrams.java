// Last updated: 5/16/2026, 6:47:32 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for (String s : strs){
5            // eat
6            // aet
7            int[] freq = new int[26];
8            for (char ch : s.toCharArray()){
9                freq[ch-'a']++;
10            }
11            StringBuilder sb = new StringBuilder();
12            for (int i=0 ; i<26 ; i++){
13                if (freq[i]>0){
14                    char ch = (char) (97+i);
15                    for (int j=0 ; j<freq[i] ; j++){
16                        sb.append(ch);
17                    }
18                    
19                }
20            }
21            String sortStr = sb.toString();
22            if (!map.containsKey(sortStr)){
23                map.put(sortStr,new ArrayList<>());
24            }    
25            map.get(sortStr).add(s);
26            
27        }
28        List<List<String>> ans = new ArrayList<>();
29        for (String key : map.keySet()){
30            ans.add(map.get(key));
31        }
32        return ans;
33    }
34    // tc -> O(n*(mlogm))
35    // sc -> O(n)
36}