// Last updated: 8/1/2025, 7:12:22 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean [] valid = new boolean[nums.length];
        List<List<Integer>> ls = new ArrayList<>();
        permutation(nums,valid,new ArrayList<>(),ls);
        return ls;
    }
    public static void permutation(int [] nums , boolean [] valid , List<Integer> ans , List<List<Integer>> ls){
        if (ans.size()==nums.length){
            ls.add(new ArrayList<>(ans));
            return;
        }
        for (int i=0 ; i<nums.length ; i++){
            if (!valid[i]){
                valid[i] = true;
                ans.add(nums[i]);
                permutation(nums,valid,ans,ls);
                ans.remove(ans.size()-1);
                valid[i] = false;
            }
        }
    }
    
}