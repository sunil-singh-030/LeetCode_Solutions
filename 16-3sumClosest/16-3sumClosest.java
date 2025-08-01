// Last updated: 8/1/2025, 7:12:57 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int out=nums[0]+nums[1]+nums[nums.length-1];
        for (int i=0;i<nums.length-2;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (Math.abs(sum-target)<Math.abs(out-target)){
                    out=sum;
                }
                int diff=Math.abs(sum-target);
                if (diff==0){
                    return sum;
                }
                else if (sum>target){
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                }
                else{
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                }
            }
            //System.out.println(out);
        }
        return out;
        

    }
}