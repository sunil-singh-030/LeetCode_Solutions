// Last updated: 10/31/2025, 7:01:35 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int [] arr={0,0};
        int index=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                arr[index]=nums[i];
                index++;
            }
        }
        return arr;


    }
}