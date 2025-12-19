// Last updated: 12/19/2025, 11:54:35 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        List<Integer> ls = new ArrayList<>();
        for (int num : set){
            ls.add(num);
        }
        Collections.sort(ls);
        int[] out = new int[Math.min(k,ls.size())];
        int ind = 0;
        for (int i=ls.size()-1 ; i>=0 ; i--){
            out[ind] = ls.get(i);
            if (ind==k-1){
                break;
            }
            ind++;
        }
        return out;
    }
}