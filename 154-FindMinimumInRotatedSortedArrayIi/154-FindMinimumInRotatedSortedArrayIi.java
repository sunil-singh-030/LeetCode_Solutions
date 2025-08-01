// Last updated: 8/1/2025, 7:10:33 AM
class Solution {
    public int findMin(int[] nums) {
        int min=5001;
        for (int i:nums){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}