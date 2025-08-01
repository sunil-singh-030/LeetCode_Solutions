// Last updated: 8/1/2025, 7:07:58 AM
class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        int maxlen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.containsKey(num-1)){
                maxlen = Math.max(map.get(num)+map.get(num-1),maxlen);
            }
            if (map.containsKey(num+1)){
                maxlen = Math.max(map.get(num)+map.get(num+1),maxlen);
            }
        }
        return maxlen;

    }
    
}