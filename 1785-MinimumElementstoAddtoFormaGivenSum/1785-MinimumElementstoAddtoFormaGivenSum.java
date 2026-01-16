// Last updated: 1/16/2026, 9:53:58 AM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        long tsum = 0;
4        for (int num : nums){
5            tsum += num;
6        }
7        long lim = (long) limit;
8        long gol = (long) goal;
9        long req = Math.abs(tsum-goal);
10        int cnt = (int) (req/Math.abs(limit));
11        if (req%Math.abs(limit)!=0){
12            cnt++;
13        }
14        return cnt;
15    }
16}