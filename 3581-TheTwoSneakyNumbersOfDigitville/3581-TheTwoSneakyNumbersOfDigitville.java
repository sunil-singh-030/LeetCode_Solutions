// Last updated: 8/1/2025, 7:02:11 AM
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