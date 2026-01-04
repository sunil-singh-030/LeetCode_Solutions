// Last updated: 1/4/2026, 11:21:30 AM
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        int n = hand.length;
4        if (n%groupSize!=0){
5            return false;
6        }
7        TreeMap<Integer,Integer> freqMap = new TreeMap<>();
8        for (int num : hand){
9            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
10        }
11        int k = n/groupSize;
12        while (k>0){
13            List<Integer> ls = new ArrayList<>();
14            int move = groupSize;
15            for (int num : freqMap.keySet()){
16                ls.add(num);
17                move--;
18                if (move==0){
19                    break;
20                }
21
22            }
23            if (ls.size()<groupSize){
24                return false;
25            }
26            for (int num : ls){
27                int cnt = freqMap.get(num);
28                if (cnt==1){
29                    freqMap.remove(num);
30                }
31                else{
32                    freqMap.put(num,cnt-1);
33                }
34            }
35            for (int i=1 ; i<groupSize ; i++){
36                if (ls.get(i)-ls.get(i-1)!=1){
37                    return false;
38                }
39            }
40            // System.out.println(ls);
41            // System.out.println(freqMap);
42            k--;
43        }
44        return true;
45
46    }
47}