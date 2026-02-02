// Last updated: 2/2/2026, 10:11:01 AM
1class Solution {
2    public int maximumLength(String s) {
3        int n = s.length();
4        int maxLen = n+1;
5        int st = 1;
6        int end = n-2;
7        while (st<=end){
8            int mid = (st+end)/2;
9            if (jaiMataDi(s,mid)){
10                maxLen = mid;
11                st = mid+1;
12            }
13            else{
14                end = mid-1;
15            }
16        }
17        return maxLen==n+1 ? -1 : maxLen;
18    }
19    public boolean jaiMataDi(String s, int len){
20        HashMap<Character,Integer> map = new HashMap<>();
21        HashMap<Character,Integer> freq = new HashMap<>();
22        for (int i=0 ; i<len ; i++){
23            char ch = s.charAt(i);
24            freq.put(ch,freq.getOrDefault(ch,0)+1);
25        }
26        if (freq.size()==1){
27            map.put(s.charAt(0),1);
28        }
29        for (int i=len ; i<s.length() ; i++){
30            char ch = s.charAt(i);
31            freq.put(ch,freq.getOrDefault(ch,0)+1);
32            freq.put(s.charAt(i-len),freq.get(s.charAt(i-len))-1);
33            if (freq.get(s.charAt(i-len))==0){
34                freq.remove(s.charAt(i-len));
35            }
36            if (freq.size()==1){
37                int prevCnt = map.getOrDefault(ch,0);
38                if (prevCnt==2){
39                    return true;
40                }
41                map.put(ch,prevCnt+1);
42            }    
43        }
44        return false;
45    }
46}