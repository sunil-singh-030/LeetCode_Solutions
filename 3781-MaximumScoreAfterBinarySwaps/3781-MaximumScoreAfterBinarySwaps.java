// Last updated: 1/15/2026, 11:34:05 AM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        int n = nums.length;
4        long tsum = 0;
5        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
6        for (int i=0 ; i<n ; i++){
7            pq.add(nums[i]);
8            if (s.charAt(i)=='1'){
9                tsum += pq.poll();
10            }
11        }
12        return tsum;
13    }
14}