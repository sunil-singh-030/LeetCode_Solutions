// Last updated: 7/12/2026, 11:54:09 AM
1class Solution {
2    // n*temp + k >= num;
3    //n >= (num-k)/temp;
4    public int minimumCost(int[] nums, int k) {
5        int temp = k;
6        long mod = (long) 1000000007;
7        long K = k;
8        long move = 0;
9        long minCost = 0;
10        for (int num : nums){
11            long curr = num;
12            if (K>=curr){
13                K -= curr;
14            }
15            else{
16                long n = (long) Math.ceil((curr-K)/(temp*1.0));
17                K += (n*temp);
18                K -= num;
19
20                long end = (move+n)%mod;
21                long st = move;
22                long currCost = ((end)*(end+1)/2)%mod - ((st)*(st+1)/2)%mod;
23                currCost %= mod;
24                minCost += currCost;
25                minCost %= mod;
26                move = end;
27                
28                //System.out.println(n+" "+K);
29            }
30            
31        }
32        return (int) minCost;
33    }
34}