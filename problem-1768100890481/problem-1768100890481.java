// Last updated: 1/11/2026, 8:38:10 AM
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
18        // System.out.println(Arrays.toString(arr));
19        // System.out.println(freq);
20        
21        for (int i=0 ; i<freq.size() ; i++){
22            if (visited[i]) continue;
23            String s = arr[i];
24            long cnt = freq.get(arr[i]);
25            for (int j=1 ; j<=25 ; j++){
26                StringBuilder temp = new StringBuilder();
27                for (char ch : s.toCharArray()){
28                    int asci = ch-'a';
29                    asci += j;
30                    if (asci<26){
31                        temp.append((char) (97+asci));
32                    }
33                    else{
34                        asci -= 26;
35                        temp.append((char) (97+asci));
36                    }
37                }
38                String str = temp.toString();
39                if (map.containsKey(str)){
40                    
41                    cnt += freq.get(str);
42                    visited[map.get(str)] = true;
43                }
44            }
45            ans += (cnt*(cnt-1)/2);         
46        }
47        return ans;
48            
49    }
50}