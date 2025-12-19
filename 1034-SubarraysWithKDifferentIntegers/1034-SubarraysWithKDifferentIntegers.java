// Last updated: 12/19/2025, 11:59:03 AM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fn(nums,k)-fn(nums,k-1);
    }
    public int fn(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int si = 0;
        int ci = 0;
        int n = nums.length;
        int cntarr = 0;
        while (ci<n){
            map.put(nums[ci],map.getOrDefault(nums[ci],0)+1);
            while (si<=ci && map.size()>k){
                int cnt = map.get(nums[si]);
                if (cnt==1){
                    map.remove(nums[si]);
                }
                else{
                    map.put(nums[si],cnt-1);
                }
                si++;
            }
            cntarr += ci-si+1;
            ci++;
        }
        return cntarr;
    }
}