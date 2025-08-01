// Last updated: 8/1/2025, 7:05:49 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int si = 0;
        int ci = 0;
        int codd = 0;
        boolean flag = false;
        int len = 0;
        while (ci<n){
            int num = nums[ci];
            if (num%2==1){
                codd++;
            }
            else{

            }
            if (codd==k){
                flag = true;
                len++;
            }
            if (codd>k){

                while (codd>k){
                    cnt += len;
                    if (nums[si]%2==1){
                        codd--;
                    }
                    si++;
                }
                len = 1;
            }
            ci++;
        }
        while (codd==k){
            cnt += len;
            if (nums[si]%2==1){
                codd--;
            }
            si++;
        }
        return cnt;
    }
}