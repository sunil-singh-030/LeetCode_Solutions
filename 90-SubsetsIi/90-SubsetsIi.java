// Last updated: 8/1/2025, 7:11:34 AM
class Solution {
    static List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ls.clear();
        subset(nums,new ArrayList<>(),0);
        return ls;
    }
    public static void subset(int [] nums , List<Integer> ans ,int index){
        if (index==nums.length){
            ls.add(new ArrayList<>(ans));
            return ;
        }
        int num = nums[index];
        int idx = index+1;
        while (idx < nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }
        subset(nums,ans,idx);
        ans.add(num);
        subset(nums,ans,index+1);
        ans.remove(Integer.valueOf(num));
    }
}