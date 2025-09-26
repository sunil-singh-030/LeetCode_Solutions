// Last updated: 9/26/2025, 1:31:23 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i]>0){
                break;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0){
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                    
                }
                else if (sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ls;
    }
}