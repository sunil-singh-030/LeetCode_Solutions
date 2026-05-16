// Last updated: 5/16/2026, 12:41:04 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        int n = nums.length;
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5        for (int num : nums){
6            if (pq.size()<k){
7                pq.add(num);
8            }
9            else{
10                if (pq.peek()<num){
11                    pq.poll();
12                    pq.add(num);
13                }
14            }
15        }
16        return pq.peek();
17    }
18}