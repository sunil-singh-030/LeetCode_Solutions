// Last updated: 7/21/2026, 6:37:22 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        
4        int n = s.length();
5        int maxCnt = 0;
6        int totalOne = 0;
7        for (char ch : s.toCharArray()){
8            if (ch=='1'){
9                totalOne++;
10            }
11        
12        }
13        maxCnt = totalOne;
14
15        List<Character> type = new ArrayList<>();
16        List<Integer> cnt = new ArrayList<>();
17
18        char currType = s.charAt(0);
19        int currCnt = 0;
20        
21        for (int i=0 ; i<n ; i++){
22            char ch = s.charAt(i);
23            if (ch==currType){
24                currCnt++;
25            }
26            else{
27                type.add(currType);
28                cnt.add(currCnt);
29                currType = ch;
30                currCnt = 1;
31            }
32        }
33        
34        type.add(currType);
35        cnt.add(currCnt);
36
37        int len = type.size();
38        
39        for (int i=1 ; i<len-1 ; i++){
40            char curr = type.get(i);
41            if (curr=='1'){
42                if (type.get(i-1)=='0' && type.get(i+1)=='0' ){
43                    
44                    int currAns = totalOne + cnt.get(i-1) + cnt.get(i+1);
45                    maxCnt  = Math.max(maxCnt,currAns);
46                    
47                }
48            }
49        }
50
51        return maxCnt;
52
53        
54
55
56
57    }
58
59
60}