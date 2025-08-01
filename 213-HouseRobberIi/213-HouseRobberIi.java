// Last updated: 8/1/2025, 7:10:04 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        if (n==2){
            return Math.max(nums[0],nums[1]);
        }
        int res1 = Math.max(max_money(0, n-2, nums),max_money(0, n-3, nums));
        int res2 = Math.max(max_money(1,n-1,nums),max_money(1,n-2,nums));
        return Math.max(res1,res2);
    }
    public static int max_money(int st,int end, int[] nums){
        int prev = -1;
        int prev2 = -1;
        if (st==0){
            prev = nums[1];
            prev2 = nums[0];
        }
        else{
            prev = nums[2];
            prev2 = nums[1];
        }
        int prev3 = -1;
        for (int i=st+2 ; i<=end ; i++){
            if (i>st+2){
                int temp1 = prev;
                int temp2 = prev2;
                prev = nums[i] + Math.max(prev2,prev3);
                prev2 = temp1;
                prev3 = temp2;
            }
            else{
                int temp1 = prev;
                int temp2 = prev2;
                prev = nums[i] + prev2;
                prev2 = temp1;
                prev3 = temp2;
            }
        }
        return Math.max(prev,prev2);
    }
    
}