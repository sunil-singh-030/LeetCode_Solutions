// Last updated: 7/23/2026, 6:23:54 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
4
5        for (int num : nums){
6            if (pq.size()<k){
7                pq.add(num);
8            }
9            else if (pq.peek()<num){
10                pq.poll();
11                pq.add(num);
12            }
13        }
14        return pq.peek();
15    }
16}