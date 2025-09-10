// Last updated: 9/10/2025, 12:10:07 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if (n%k!=0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num)>(n/k)){
                return false;
            }
        }
        return true;
        
        
    }
}