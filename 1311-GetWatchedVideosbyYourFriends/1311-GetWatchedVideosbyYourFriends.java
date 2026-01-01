// Last updated: 1/1/2026, 10:46:24 AM
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
3        
4        int k = level;
5        Queue<Integer> q = new LinkedList<>();
6        HashSet<Integer> visited = new HashSet<>();
7        q.add(id);
8        visited.add(id);
9        while (!q.isEmpty() && k-->0){
10            int size = q.size();
11            for (int i=0 ; i<size ; i++){
12                int person = q.poll();
13                for (int fri : friends[person]){
14                    if (!visited.contains(fri)){
15                        q.add(fri);
16                        visited.add(fri);
17                    }
18                }
19            }
20            
21        }
22        HashMap<String,Integer> cntVideos = new HashMap<>();
23        while (!q.isEmpty()){
24            int friId = q.poll();
25            for (String vid : watchedVideos.get(friId)){
26                cntVideos.put(vid,cntVideos.getOrDefault(vid,0)+1);
27            }
28        }
29        List<String> ans = new ArrayList<>();
30        for (String vid : cntVideos.keySet()){
31            ans.add(vid);
32        }
33        Collections.sort(ans,(a,b)->{
34            if (cntVideos.get(a)!=cntVideos.get(b)){
35                return cntVideos.get(a)-cntVideos.get(b);
36            }
37            else{
38                return a.compareTo(b);
39            }
40        });
41        return ans;
42    }
43}