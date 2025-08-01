// Last updated: 8/1/2025, 7:06:40 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int msum=Integer.MIN_VALUE;
		int sum=0;
		for (int i=0;i<nums.length;i++) {
			sum+=nums[i];
			msum=Math.max(msum, sum);
			if (sum<0) {
				sum=0;
			}
		}

        int minsum=Integer.MAX_VALUE;
		sum=0;
		for (int i=0;i<nums.length;i++) {
			sum+=nums[i];
			minsum=Math.min(minsum, sum);
			if (sum>0) {
				sum=0;
			}
		}

        int totalsum=0;
        for (int i:nums){
            totalsum+=i;
        }
        System.out.println(minsum); 
        int ans=totalsum-minsum;
        if (ans==0){
            return msum;
        }
        return Math.max(msum,ans);
    }
}