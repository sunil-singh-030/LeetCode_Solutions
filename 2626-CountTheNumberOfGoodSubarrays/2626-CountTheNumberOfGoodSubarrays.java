// Last updated: 8/1/2025, 7:03:17 AM
class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        long cnt = 0;
        int si = 0;
        int ci = 0;
        long cpair  = 0;
        while (ci<n){
            int num = nums[ci];
            int cocc = map.getOrDefault(num,0);
            map.put(num,cocc+1);
            if (cocc>=1){
                cpair += cocc;
            }
            if (cpair>=k){
                int add = (n-ci);
                while (cpair>=k){
                    cnt += add;
                    int number = nums[si];
                    int numocc = map.get(number);
                    map.put(number,numocc-1);
                    cpair -= (numocc-1);
                    si++;
                }
            }
            ci++;
        }
        return cnt;
    }
}