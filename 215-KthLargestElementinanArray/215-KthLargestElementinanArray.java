// Last updated: 9/29/2025, 6:32:39 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return kth_largest_ele(nums,k);
    }
    public static int kth_largest_ele(int[] arr, int k ) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i=0; i<k ; i++) {
			pq.add(arr[i]);
		}
		for (int i=k ; i<arr.length ; i++) {
			if (arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
}