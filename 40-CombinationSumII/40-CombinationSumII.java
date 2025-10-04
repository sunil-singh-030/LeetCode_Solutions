// Last updated: 10/4/2025, 7:02:30 AM
class Solution {
    static List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ls.clear();
        comb2(candidates,target,new ArrayList<>(),0);
        return ls;
    }
    public static void comb2(int [] candi , int target , List<Integer> ans , int index){
        if (target==0){
            ls.add(new ArrayList<>(ans));
            return;
        }
        if (index==candi.length){
            return;
        }
        int num = candi[index];
        if (target>=num){
            int idx = index+1;
            while (idx<candi.length && candi[idx]==candi[idx-1]){
                idx++;
            }
            comb2(candi,target,ans,idx);
            ans.add(num);
            comb2(candi,target-num,ans,index+1);
            ans.remove(Integer.valueOf(num));
        }
    }
}