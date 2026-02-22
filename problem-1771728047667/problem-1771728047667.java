// Last updated: 2/22/2026, 8:10:47 AM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        long[] fact = new long[10];
4        fact[0] = 1;
5        for (int i=1 ; i<10 ; i++){
6            fact[i] = i*fact[i-1];
7        }
8        long tsum = 0;
9        int temp = n;
10        HashMap<Integer,Integer> map = new HashMap<>();
11        while (temp>0){
12            int dig = temp%10;
13            map.put(dig,map.getOrDefault(dig,0)+1);
14            tsum += fact[dig];
15            temp /= 10;
16        }
17        while (tsum>0){
18            int dig = (int) tsum%10;
19            int cnt = map.getOrDefault(dig,0);
20            if (cnt==0){
21                return false;
22            }
23            else{
24                if (cnt==1){
25                    map.remove(dig);
26                }
27                else{
28                    map.put(dig,cnt-1);
29                }
30            }
31            tsum /= 10;
32        }
33        return map.size()==0 ;
34        
35    }
36}