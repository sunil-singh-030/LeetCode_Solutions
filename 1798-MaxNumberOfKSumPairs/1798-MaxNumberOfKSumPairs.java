// Last updated: 8/1/2025, 7:04:53 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int sum=nums[left]+nums[right];
            if (sum<k){
                left++;
            }
            else if (sum>k){
                right--;
            }
            else{
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}