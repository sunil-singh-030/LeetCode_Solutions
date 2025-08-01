// Last updated: 8/1/2025, 7:11:42 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int max=nums[nums.length-1];
        int num=nums[0];
        int c=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==num){
                c++;
                if (c<=2){
                    k++;
                }
                else{
                    nums[i]=max+1;
                }
            }
            else{
                num=nums[i];
                c=1;
                k++;
            }
            System.out.println(k);
        }
        Arrays.sort(nums);
        return k;
    }
}