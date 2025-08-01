// Last updated: 8/1/2025, 7:09:26 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                return num;
            }
            else{
                map.put(num,1);
            }
        }
        return 0;
    }
}