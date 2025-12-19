// Last updated: 12/19/2025, 11:54:00 AM
class Solution {
    public int minimumDistance(int[] nums) {
        // 2*(k-i);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for (int i=0 ; i<n ; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for (int key : map.keySet()){
            //System.out.println(key+" "+)
            List<Integer> ls = map.get(key);
            if (ls.size()>2){
                for (int i=2 ; i<ls.size() ; i++){
                    ans = Math.min(ans,2*(ls.get(i)-ls.get(i-2)));
                }
            }
        }
        if (ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}