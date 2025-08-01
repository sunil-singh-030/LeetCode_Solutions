// Last updated: 8/1/2025, 7:11:50 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix[0].length-1;
        while (left<matrix.length && right>=0){
            int num=matrix[left][right];
            if (num==target){
                return true;
            }
            else{
                if (num>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return false;
    }
}