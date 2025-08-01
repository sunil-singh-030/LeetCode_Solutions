// Last updated: 8/1/2025, 7:03:32 AM
class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[82];
        int ans = -1;
        for (int num : nums){
            int s = 0;
            int temp = num;
            while (temp>0){
                s += temp%10;
                temp /= 10;
            }
            if (max[s]!=0){
                ans = Math.max(ans,num+max[s]);
            }
            max[s] = Math.max(num,max[s]);
        }
        return ans;
    }
}