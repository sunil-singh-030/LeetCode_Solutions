// Last updated: 12/19/2025, 11:54:25 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int xor = 0;
        for (int num : nums){
            xor ^= num;
            set.add(num);
        }
        if (set.size()==1 && set.contains(0)) return 0;
        if (xor!=0) return nums.length;
        return nums.length-1;
    }
    
}