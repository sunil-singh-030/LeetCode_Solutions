// Last updated: 1/22/2026, 2:27:41 PM
1class Solution {
2    public long calculateScore(String s) {
3        long ans = 0;
4        List<List<Integer>> ls = new ArrayList<>();
5        for (int i=0 ; i<26 ; i++){
6            ls.add(new ArrayList<>());
7        }
8        int n = s.length();
9        for (int i=0 ; i<n ; i++){
10            int asci = s.charAt(i)-'a';
11            int req = 25-asci;
12            if (ls.get(req).size()>0){
13                int size = ls.get(req).size();
14                int recent = ls.get(req).get(size-1);
15                ls.get(req).remove(size-1);
16                ans += i-recent;
17            }
18            else{
19                ls.get(asci).add(i);
20            }
21            //System.out.println(ans);
22
23        }
24        return ans;
25    }
26}