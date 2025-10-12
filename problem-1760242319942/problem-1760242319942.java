// Last updated: 10/12/2025, 9:41:59 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()){
            if (map.get(key)%k==0){
                ans += (map.get(key)*key);
            }
        }
        return ans;
    }
}