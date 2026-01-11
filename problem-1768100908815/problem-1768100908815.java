// Last updated: 1/11/2026, 8:38:28 AM
1class Solution {
2    public long countPairs(String[] words) {
3        int n = words.length;
4        HashMap<String,Integer> freq = new HashMap<>();
5        HashMap<String,Integer> map = new HashMap<>();
6        for (int i=0 ; i<n ; i++){
7            freq.put(words[i],freq.getOrDefault(words[i],0)+1);
8        }
9        boolean[] visited = new boolean[freq.size()];
10        long ans = 0;
11        String[] arr = new String[freq.size()];
12        int idx = 0;
13        for (String s : freq.keySet()){
14            map.put(s,idx);
15            arr[idx] = s;
16            idx++;
17        }
18        for (int i=0 ; i<freq.size() ; i++){
19            if (visited[i]) continue;
20            String s = arr[i];
21            long cnt = freq.get(arr[i]);
22            for (int j=1 ; j<=25 ; j++){
23                StringBuilder temp = new StringBuilder();
24                for (char ch : s.toCharArray()){
25                    int asci = ch-'a';
26                    asci += j;
27                    if (asci<26){
28                        temp.append((char) (97+asci));
29                    }
30                    else{
31                        asci -= 26;
32                        temp.append((char) (97+asci));
33                    }
34                }
35                String str = temp.toString();
36                if (map.containsKey(str)){
37                    
38                    cnt += freq.get(str);
39                    visited[map.get(str)] = true;
40                }
41            }
42            ans += (cnt*(cnt-1)/2);         
43        }
44        return ans;
45            
46    }
47}