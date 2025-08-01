// Last updated: 8/1/2025, 7:01:02 AM
class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        long cnt = 0;
        for (int num : nums){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        map2.put(nums[n-1],1);
        for (int i=n-2 ; i>=1 ; i--){
            int req = nums[i]*2;
            if (map2.containsKey(req)){
                long cntright = (long) map2.get(req);
                long cntleft = (long) map1.get(req)-cntright;
                if (req==0){
                    cntleft--;
                }
                long add = (long) (cntright*cntleft);
                cnt += add;
            }
            cnt %= 1000000007;
            map2.put(nums[i],map2.getOrDefault(nums[i],0)+1);
            //System.out.println(cnt);
        }
        cnt %= 1000000007;
        return (int) cnt;
    }
}