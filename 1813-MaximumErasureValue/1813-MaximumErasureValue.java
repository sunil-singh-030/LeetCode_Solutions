// Last updated: 8/1/2025, 7:04:51 AM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int maxscore = 0;
        int curr = 0;
        int si = 0;
        int ci = 0;
        while (ci<n){
            int num = nums[ci];
            if (!set.contains(num)){
                curr += num;
                set.add(num);
            }
            else{
                maxscore = Math.max(maxscore,curr);
                while (nums[si]!=num){
                    curr -= nums[si];
                    set.remove(nums[si]);
                    si++;
                }
                si++;
            }
            ci++;
        }
        maxscore = Math.max(maxscore,curr);
        return maxscore;
    }
}