// Last updated: 8/1/2025, 7:10:24 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] out={-1,-1};
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            int sum=numbers[left]+numbers[right];
            if (sum>target){
                right--;
            }
            else if (sum<target){
                left++;
            }
            else{
                out[0]=++left;
                out[1]=++right;
                break;
            }
        }
        return out;
    }
}