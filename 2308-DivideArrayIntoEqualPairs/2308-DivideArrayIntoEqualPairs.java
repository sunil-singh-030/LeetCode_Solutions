// Last updated: 8/1/2025, 7:03:53 AM
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()){
            if (map.get(key)%2==1){
                return false;
            }
        }
        return true;
    }
}