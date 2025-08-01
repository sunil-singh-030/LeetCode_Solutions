// Last updated: 8/1/2025, 7:03:58 AM
class Solution {
    public int countPairs(int[] nums, int k) {
        int cnt = 0;
        for (int i=0 ; i<nums.length ; i++){
            for (int j=i+1 ; j<nums.length ; j++){
                if ((i*j)%k==0 && nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}