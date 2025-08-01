// Last updated: 8/1/2025, 7:11:47 AM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ls = new ArrayList<>();
        allway(n,k,1,new ArrayList<>(),ls);
        return ls;
    }
    public static void allway(int n , int k , int start , List<Integer> ans,List<List<Integer>> ls){
        if (k==0){
            ls.add(new ArrayList<>(ans));
            return;
        }

        for (int i=start ; i<=n ; i++){
            ans.add(i);
            allway(n,k-1,i+1,ans,ls);
            ans.removeLast();
        }
    }
}