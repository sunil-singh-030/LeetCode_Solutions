// Last updated: 8/1/2025, 7:03:52 AM
class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]!=nums[i-1]){
                ls.add(nums[i]);
            }
        }
        int cnt = 0;
        for (int i=1 ; i<ls.size()-1 ; i++){
            if (ls.get(i)>ls.get(i-1) && ls.get(i)>ls.get(i+1)){
                cnt++;
            }
            if (ls.get(i)<ls.get(i-1) && ls.get(i)<ls.get(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}