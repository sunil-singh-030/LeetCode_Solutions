// Last updated: 8/1/2025, 7:10:02 AM
class Solution {
    static List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] candidates = {1,2,3,4,5,6,7,8,9};
        ls.clear();
        comb2(candidates,n,new ArrayList<>(),0,k);
        return ls;
    }
    public static void comb2(int [] candi , int target , List<Integer> ans , int index , int k){
        if (target==0 ){
            if (ans.size()==k){
                ls.add(new ArrayList<>(ans));
            }
            return;
        }
        if (index==candi.length){
            return;
        }
        int num = candi[index];
        if (ans.size()<k){
            if (target>=num){
                int idx = index+1;
                while (idx<candi.length && candi[idx]==candi[idx-1]){
                    idx++;
                }
                comb2(candi,target,ans,idx , k);
                ans.add(num);
                comb2(candi,target-num,ans,index+1,k);
                ans.remove(Integer.valueOf(num));
            }
        }
        
    }
}