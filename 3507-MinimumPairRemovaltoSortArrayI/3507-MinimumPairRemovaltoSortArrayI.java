// Last updated: 1/22/2026, 10:25:21 AM
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        List<Integer> ls = new ArrayList<>();
4        for (int num : nums){
5            ls.add(num);
6        }
7        int move = 0;
8        boolean flag = true;
9        while (flag){
10            flag = false;
11            int maxsum = 1000000;
12            int ind = -1;
13            for (int i=1 ; i<ls.size() ; i++){
14                int sum = ls.get(i) + ls.get(i-1);
15                if (ls.get(i)<ls.get(i-1)){
16                    flag = true;
17                }
18                if (sum<maxsum){
19                    maxsum = sum;
20                    ind = i;
21                }
22                //System.out.println(maxsum+" "+i);
23            }
24            if (flag){
25                ls.set(ind,maxsum);
26                ls.remove(ind-1);
27                move++;
28            }
29            //System.out.println(ls);
30        }
31        return move;
32    }
33}