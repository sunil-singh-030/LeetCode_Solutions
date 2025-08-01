// Last updated: 8/1/2025, 7:02:06 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if (!set.contains(num)){
                ls.add(num);
                set.add(num);
            }
        }
        if (ls.get(0)<k){
            return -1;
        }
        if (ls.get(0)==k){
            return ls.size()-1;
        }
        return ls.size();
    }
}