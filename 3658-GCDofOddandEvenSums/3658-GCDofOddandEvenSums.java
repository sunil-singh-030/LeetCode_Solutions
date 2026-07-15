// Last updated: 7/15/2026, 5:59:53 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumo = 0;
4        int sume = 0;
5        int num = 1;
6        int move = n;
7        while (move-->0){
8            sumo += num;
9            num += 2;
10        }
11        num = 2;
12        move = n;
13        while (move-->0){
14            sume += num;
15            num += 2;
16        }
17        //System.out.println(sumo+" "+sume);
18        int ans = -1;
19        for (int i=Math.min(sumo,sume) ; i>=1 ; i--){
20            if (sumo%i==0 && sume%i==0){
21                ans = i;
22                break;
23            }
24        }
25        return ans;
26    }
27}