// Last updated: 2/16/2026, 9:36:29 PM
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        HashMap<String,Integer> map = new HashMap<>();
4        for (String word : words){
5            if (word.length()>=k){
6                String prefix = word.substring(0,k);
7                map.put(prefix,map.getOrDefault(prefix,0)+1);
8            }
9        }
10        int cnt = 0;
11        for (String key : map.keySet()){
12            if (map.get(key)>1){
13                cnt++;
14            }
15        }
16        return cnt;
17    }
18}