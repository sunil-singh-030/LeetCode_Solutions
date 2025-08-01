// Last updated: 8/1/2025, 7:04:26 AM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<nums.length;i++){
            String s = nums[i];
            char ch = s.charAt(i);
            if (ch=='1'){
                ans.append('0');
            }
            else{
                ans.append('1');
            }
        }
        return ans.toString();
    }
}