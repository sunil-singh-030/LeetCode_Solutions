// Last updated: 8/1/2025, 7:01:44 AM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            boolean flag = true;
            if (i-k>=0){
                if (nums[i-k]>=num){
                    flag = false;
                }
               
            }
            if (i+k<nums.length){
                if (nums[i+k]>=num){
                    flag = false;
                }
            }
            if (flag){
                sum += num;
            }
        }
        return sum;
    }
}