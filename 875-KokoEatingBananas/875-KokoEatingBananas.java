// Last updated: 5/16/2026, 12:35:00 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int n = piles.length;
4        int min = 1;
5        int max = 1;
6        for (int num : piles){
7            max = Math.max(max,num);
8        }
9        int ans = 1;
10        while (min<=max){
11            int mid = (min+max)/2;
12            if (ispossible(piles,h,mid)){
13                ans = mid;
14                max = mid-1;
15            }
16            else{
17                min = mid+1;
18            }
19        }
20        return ans;
21    }
22    public boolean ispossible(int[] piles, int h, int k){
23        for (int num : piles){
24            int currHr = num/k;
25            if (num%k!=0){
26                currHr++;
27            }
28            h -= currHr;
29            if (h<0) return false;
30
31        }
32        return true;
33    }
34}