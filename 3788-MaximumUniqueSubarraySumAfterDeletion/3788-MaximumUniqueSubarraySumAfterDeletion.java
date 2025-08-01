// Last updated: 8/1/2025, 7:01:24 AM
class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int minNeg = Integer.MIN_VALUE;
        for (int num : nums){
            if (num>=0){
                set.add(num);
            }
            else{
                minNeg = Math.max(minNeg,num);
            }
        }
        if (set.isEmpty()){
            return minNeg;
        }
        else{
            int maxsum = 0;
            for (int num : set){
                maxsum += num;
            }
            return maxsum;
        }
    }
}