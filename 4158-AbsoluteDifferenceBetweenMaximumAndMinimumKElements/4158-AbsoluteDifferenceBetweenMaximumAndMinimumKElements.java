// Last updated: 12/19/2025, 11:53:54 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int s1 = 0;
        for (int i=0 ; i<k ; i++){
            s1 += nums[i];
        }
        int s2 = 0;
        for (int i=n-1 ; i>n-1-k ; i--){
            s2 += nums[i];
        }
        return s2-s1;
    }
}