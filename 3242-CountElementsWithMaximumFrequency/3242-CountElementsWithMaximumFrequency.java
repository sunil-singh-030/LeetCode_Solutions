// Last updated: 12/19/2025, 11:56:21 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int max = 0;
        for (int i=0 ; i<n ; i++){
            int cnt = map.getOrDefault(nums[i],0);
            max = Math.max(max,cnt+1);
            map.put(nums[i],cnt+1);
        }
        int ans = 0;
        for (int key : map.keySet()){
            if (map.get(key)==max){
                ans += max;
            }
        }
        return ans;
    }
}