// Last updated: 8/1/2025, 7:02:54 AM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if (!set.contains(num)){
                set.add(num);
            }
        }
        int tdst = set.size();
        int si = 0;
        int ci = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (ci<n){
            map.put(nums[ci],map.getOrDefault(nums[ci],0)+1);
            while (map.size()==tdst){
                cnt += (n-ci);
                int prevcnt = map.get(nums[si]);
                int num = nums[si];
                map.put(nums[si],prevcnt-1);
                si++;
                if (prevcnt==1){
                    map.remove(num);
                    break;
                }
                //si++;
            }
            ci++;
        }
        return cnt;
    }
}