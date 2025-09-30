// Last updated: 9/30/2025, 11:43:14 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.add(i);
            if(i>=k-1)ans[i-k+1]=nums[q.peekFirst()];
        }
        return ans;
    }
}