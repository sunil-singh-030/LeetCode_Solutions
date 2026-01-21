// Last updated: 1/21/2026, 2:32:58 PM
1class Solution {
2    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
3        int n = s.length();
4        List<List<Integer>> adjLs = new ArrayList<>();
5        for (int i=0 ; i<n ; i++){
6            adjLs.add(new ArrayList<>());
7        }
8        for (List<Integer> ls : pairs){
9            adjLs.get(ls.get(0)).add(ls.get(1));
10            adjLs.get(ls.get(1)).add(ls.get(0));
11        }
12        char[] ans = new char[n];
13        HashSet<Integer> visited = new HashSet<>();
14        for (int i=0 ; i<n ; i++){
15            if (!visited.contains(i)){
16                int[] freq = new int[26];
17                List<Integer> indices = new ArrayList<>();
18                Queue<Integer> q = new LinkedList<>();
19                q.add(i);
20                while (!q.isEmpty()){
21                    int curr = q.poll();
22                    if (visited.contains(curr)){
23                        continue;
24                    }
25                    freq[s.charAt(curr)-'a']++;
26                    indices.add(curr);
27                    visited.add(curr);
28                    for (int nbr : adjLs.get(curr)){
29                        if (!visited.contains(nbr)){
30                            q.add(nbr);
31                        }
32                    }
33                }
34                Collections.sort(indices);
35                int idx = 0;
36                for (int j=0 ; j<26 ; j++){
37                    while (freq[j]>0){
38                        ans[indices.get(idx)] = (char) (97+j);
39                        freq[j]--;
40                        idx++;
41                    }
42                }
43            }
44        }
45        StringBuilder out = new StringBuilder();
46        for (char ch : ans){
47            out.append(ch);
48        }
49        return out.toString();
50    }
51}