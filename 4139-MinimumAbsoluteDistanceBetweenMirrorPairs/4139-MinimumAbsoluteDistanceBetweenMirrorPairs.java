// Last updated: 12/19/2025, 11:53:58 AM
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        HashMap<Long,Integer> map = new HashMap<>();
        int ans = n+1;
        for (int i=0 ; i<n ; i++){
            if (map.containsKey((long) (nums[i]))){
                ans = Math.min(ans,i-map.get((long) (nums[i])));
            }
            int cnum = nums[i];
            long nnum = 0;
            while (cnum>0){
                nnum = nnum*10 + cnum%10;
                cnum /= 10;
            }
            map.put(nnum,i);
        }
        return ans==n+1 ? -1 : ans;
    }
}