// Last updated: 8/1/2025, 7:02:36 AM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] out = new int[n/3][3];
        Arrays.sort(nums);
        int ind = 0;
        for (int i=0 ; i<out.length ; i++){
            for (int j=0 ; j<3 ; j++){
                out[i][j] = nums[ind];
                ind++;
            }
            if (out[i][2]-out[i][0]>k){
                int[][] out1 = new int[0][0]; 
                return out1;
            }
        }
        return out;
    }
}