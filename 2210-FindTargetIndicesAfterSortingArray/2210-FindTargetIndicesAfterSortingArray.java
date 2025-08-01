// Last updated: 8/1/2025, 7:04:08 AM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int start = -1;
        int end = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]>=target){
                if (nums[mid]==target){
                    start = mid;
                }
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        left = 0;
        right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<=target){
                if (nums[mid]==target){
                    end = mid;
                }
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        if (start==-1){
            return ls;
        }
        for (int i=start ; i<=end ; i++){
            ls.add(i);
        }
        return ls;
    }
}