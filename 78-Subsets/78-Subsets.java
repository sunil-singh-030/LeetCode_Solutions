// Last updated: 10/3/2025, 10:45:39 AM
class Solution {
    static List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ls.clear();
        subset(nums,new ArrayList<>(),0);
        return ls;
    }
    public static void subset(int [] nums , List<Integer> ans , int index){
        if (index==nums.length){
            ls.add(new ArrayList<>(ans));
            return ;
        }
        int num = nums[index];
        subset(nums,ans,index+1);
        ans.add(num);
        subset(nums,ans,index+1);
        ans.remove(Integer.valueOf(num));
    }
}