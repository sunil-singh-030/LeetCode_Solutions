// Last updated: 8/1/2025, 7:03:42 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);
        int num = nums[0];
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]-num<=k){
                continue;
            }
            cnt++;
            num = nums[i];
        }
        return cnt+1;
    }
}