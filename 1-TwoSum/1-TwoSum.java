// Last updated: 8/1/2025, 7:13:16 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr=new int[2];
        for (int i=0;i<nums.length;i++){
            int num=target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==num){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
           
        }
        return arr;
    }   
}