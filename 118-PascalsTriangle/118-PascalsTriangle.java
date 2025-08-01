// Last updated: 8/1/2025, 7:11:05 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        while (numRows-->0){
            ans.add(prev);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int i=1 ; i<prev.size() ; i++){
                curr.add(prev.get(i-1)+prev.get(i));
            }
            curr.add(1);
            prev = curr;
        }
        return ans;
    }
}