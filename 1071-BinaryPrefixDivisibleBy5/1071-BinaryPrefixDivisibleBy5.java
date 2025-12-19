// Last updated: 12/19/2025, 11:58:59 AM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        // 101  1010  1111  10100 11001 11110  100011
        //011001
        //0 1 3 6 12 25
        List<Boolean> ans = new ArrayList<>();
        long num = nums[0];
        if (num==0){
            ans.add(true);
        }
        else{
            ans.add(false);
        }
        for (int i=1 ; i<nums.length ; i++){
            num %= 5;
            if (nums[i]==0){
                num *= 2;
                if (num==0){
                    num = nums[i];
                }
            }
            else{
                num = num*2 + 1;
                if (num==0){
                    num = nums[i];
                }
            }
            if (num%5==0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}